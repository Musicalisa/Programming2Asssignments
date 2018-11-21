//a way to manipulate potential errors
import java.io.IOException;
import java.io.FileReader;
//this is a byte by byte buffer
import java.io.BufferedReader;
import java.util.ArrayList;
import java.util.*;

class FileLoader {

	String firstName;
	String lastName;
	String phone;

	private String path;

	public FileLoader(String file_path) {

		path = file_path;

	}

	public ArrayList<DefaultContact> loadFile() throws IOException {
		//class that initialtes a stream of bytes (water) is FileReader
		FileReader inStream = new FileReader(path);
		//BufferedReader is our cup to measure the flow of data
		BufferedReader inBuffer = new BufferedReader(inStream);
		//This is the last two lines combined using method chaining:
		//BufferedReader inBuffer = new BufferedReader(new FileReader(path));

//		ArrayList<String> allTheLines = new ArrayList<String>();
		String line;
//		int i = 0;


	ArrayList<DefaultContact> allTheContacts = new ArrayList<DefaultContact>();

	while ((line = inBuffer.readLine()) != null && !line.isEmpty()) {

			String[] values = line.split(",");
//			System.out.println(values[0] + " " +  values[1] + " " +  values[2]);
//			Arrays.toString(values);
//			DefaultContact newContact = new DefaultContact(values[0], values[1], values[2]);

			allTheContacts.add(new DefaultContact (values[0],values[1],values[2]));
	//		line = inBuffer.readLine();    // Read the next line
		}


		inBuffer.close();
		return allTheContacts;

	}

}
