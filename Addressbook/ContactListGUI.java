import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.*;
import java.io.*;

public class ContactListGUI implements ActionListener {

	JTextArea output;
	JScrollPane scrollPane;

	JMenuBar menuBar;
        JMenu menu;
	JMenu submenu;

        JMenuItem menuItem;
	JMenuItem print;
	JMenuItem add;
	JMenuItem delete;

	Scanner input = new Scanner(System.in);
	static FileWriter myWriter;

	static ContactList myList = new ContactList();
	ArrayList<String> allStringContacts = new ArrayList<String>();

	public ArrayList<DefaultContact> GUIPrint() throws IOException {

		ContactList myList = new ContactList();
		FileReader inStream = new FileReader("myContacts.txt");
		BufferedReader inBuffer = new BufferedReader(inStream);
		String line;
		ArrayList<DefaultContact> allTheContacts = new ArrayList<DefaultContact>();
		while ((line = inBuffer.readLine()) != null && !line.isEmpty()) {
			String[] values = line.split(",");
			allTheContacts.add(new DefaultContact (values[0],values[1],values[2]));
		}
		inBuffer.close();
		return allTheContacts;
	}


		public JMenuBar createMenuBar() {

			//Creating the menu bar.
			menuBar = new JMenuBar();

			//Building the first menu.
			menu = new JMenu("Main Menu");
			menuBar.add(menu);

			//a couple of JMenuItems
			print = new JMenuItem("Print all contacts");
			menu.add(print);

			add = new JMenuItem("Add a contact");
			menu.add(add);

				//a submenu
				submenu = new JMenu("Update/Modify a contact");

				menuItem = new JMenuItem("Update first name");
				submenu.add(menuItem);
				menu.add(submenu);

				menuItem = new JMenuItem("Update last name");
				submenu.add(menuItem);
				menu.add(submenu);

				menuItem = new JMenuItem("Update phone number");
				submenu.add(menuItem);
				menu.add(submenu);

		//one more JMenuItem
		delete = new JMenuItem("Delete a contact");
		menu.add(delete);

			//adding action listeners
			menuItem.addActionListener(this);
			print.addActionListener(this);
			add.addActionListener(this);
			delete.addActionListener(this);

		return menuBar;

		}

    public Container createContentPane() {

        //Create the content-pane-to-be.
        JPanel contentPane = new JPanel(new BorderLayout());
        contentPane.setOpaque(true);

        //Create a scrolled text area.
        output = new JTextArea();
	output.setPreferredSize(new Dimension(100, 100));
        output.setEditable(false);
	output.setBackground(new Color(0,255,255));
        scrollPane = new JScrollPane(output);

        //Add the text area to the content pane.
        contentPane.add(scrollPane, BorderLayout.CENTER);

        return contentPane;
    }



	public void GUILoader() {

		try {
			for (DefaultContact foo : GUIPrint()) {
				output.append(foo.toString());

			}

		} catch (IOException ioe) {

			System.out.println(ioe.getMessage());
		}

	}



public void actionPerformed(ActionEvent e) {

	if (e.getSource() == menuItem) {


	}else if (e.getSource() == print) {

		GUILoader();


	}else if (e.getSource() == add) {

		do{
			String fName = JOptionPane.showInputDialog("Please provide the first name of the contact: ");
			String lName = JOptionPane.showInputDialog("Please provide the last name of the contact: ");
			String phone = JOptionPane.showInputDialog("Please provide the phone number of the contact: ");

			DefaultContact newContact = new DefaultContact(fName,lName,phone);
			myList.insert(newContact);
			myList.save("myContacts.txt");
			GUILoader();

		}while ((JOptionPane.showInputDialog("Would you like to add another contact? ")).equalsIgnoreCase("Y"));



		}else if (e.getSource() == delete) {
		do{

				GUILoader();
				String input = JOptionPane.showInputDialog("Please provide the numerical position of the contact you wish to remove from the above list: ");
				int pos = Integer.parseInt(input);
				myList.remove(pos - 1);
				GUILoader();
				myList.save("myContacts.txt");

			}while ((JOptionPane.showInputDialog("Would you like to remove another contact? ")).equalsIgnoreCase("Y"));

		}
	}


		private static void createAndShowGUI() {

			//Create and set up the window.
			JFrame frame = new JFrame("Your Digital Contact List");
			frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

			//Create and set up the content pane.
			ContactListGUI myGUI = new ContactListGUI();
			frame.setJMenuBar(myGUI.createMenuBar());
			frame.setContentPane(myGUI.createContentPane());

			//Display the window.
			frame.setSize(450, 260);
			frame.setVisible(true);
		}


    public static void main(String[] args) {

		javax.swing.SwingUtilities.invokeLater(new Runnable() {

			public void run() {
				createAndShowGUI();
			}
		});
	}

}
