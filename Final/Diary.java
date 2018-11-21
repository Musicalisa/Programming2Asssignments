/*Diary.java - Write a java program that prompts a user for a diary entry
and then adds that text to the end of a diary.txt file.*/

import java.io.FileWriter;
import java.io.IOException;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.ArrayList;

class Diary {

	static FileWriter myWriter;

	public static void main(String[] args) throws IOException {

		Scanner userInput = new Scanner(System.in);
		ArrayList<String> myDiary = new ArrayList<String>();

		System.out.print("\nWelcome to your digital library!!\n\n");
		System.out.print("Please enter a diary entry: ");

		myDiary.add(userInput.nextLine());

	try {
		myWriter = new FileWriter("Diary.txt", true);

	}catch (IOException ioe) {

		System.out.println(ioe.getMessage());

	}try {

		for(String str: myDiary) {
			myWriter.write(str + "\n");

		}
		myWriter.close();

	}catch (IOException ioe) {

		System.out.println(ioe.getMessage());

		}
	}
}

