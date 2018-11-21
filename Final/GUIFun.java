/*GuiFun.java - Write a program that uses a GUI to prompt a user for
input.  Modify that input and then display the modified data back to the
user in a GUI.*/

import javax.swing.*;
import java.awt.*;
import java.util.Scanner;

class GUIFun {

static Scanner userInput = new Scanner(System.in);
static String answer;

GUIFun() {

JFrame frame = new JFrame("Day of the Week");
JPanel panel = new JPanel();
JLabel myLabel = new JLabel("Today is " + answer + "!!!");

panel.add(myLabel);
frame.getContentPane().add(panel);

frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
frame.pack();
frame.setVisible(true);

}

public static void main (String[] args) {

	System.out.print("\nPlease enter the day of the week: ");
	answer = userInput.nextLine();
	new GUIFun();

	}
}


