import java.io.*;
import java.util.Arrays;
import java.util.ArrayList;
import java.io.FileWriter;
import java.io.FileReader;
import java.io.IOException;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.io.BufferedReader;

public class ContactList{

	String firstName;
	String lastName;
	String phone;

	static FileWriter myWriter;
        static FileOutputStream myFileOutput;

	static String inFile = "myContacts.txt";
	static String outFile = "myContacts.txt";

	//allotting space to hold multiple DefaultContacts in an arrayList
	public static ArrayList<DefaultContact> myContactList= new ArrayList<DefaultContact>();

	//creating an array of strings for loading
	static ArrayList<String> contactRecord = new ArrayList<String>();

	public void print() {

		System.out.println(myContactList);

	}


	public void insert(DefaultContact myDefaultContact) {

		myContactList.add(myDefaultContact);

	}

	public void load(String file) {


		try {
			FileLoader loadee = new FileLoader(inFile);
			myContactList = loadee.loadFile();

		} catch (IOException ioe) {

			System.out.println(ioe.getMessage());

		}
	}

	public void save(String file) {

		try {

			FileDumper dumpee = new FileDumper(outFile);
			dumpee.dumpFile(myContactList);

		} catch (IOException ioe) {

			System.out.println(ioe.getMessage());

		}

	}

	public void remove(int index){

		myContactList.remove(index);

	}

	public DefaultContact getIndex(int index){

		return (myContactList.get(index));

	}

	public void updateFirstName(DefaultContact myDefaultContact, String newFirst) {

		myDefaultContact.setFirstName(newFirst);

	}

	public void updateLastName(DefaultContact myDefaultContact, String newLast) {

		myDefaultContact.setLastName(newLast);

	}

	public void updatePhone(DefaultContact myDefaultContact, String newPhone) {

		myDefaultContact.setPhone(newPhone);

	}


}





