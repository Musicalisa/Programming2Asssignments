import java.io.FileWriter;
import java.io.IOException;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.Scanner;

public class ContactListCLI {
static ContactList myList = new ContactList();
Scanner input = new Scanner(System.in);
static FileWriter myWriter;


	public ContactListCLI() {
		int response;
		System.out.println();
		System.out.println("Welcome to your digital Address Book!");

		do {
			myList.load("myContacts.txt");
			Menu();
			response = input.nextInt();
			System.out.println();

		switch (response) {

				case 0:
					myList.print();
					break;

				case 1:
					cliInsert();
					break;

				case 2:
					cliUpdate();
					break;

				case 3:
					cliRemove();
					break;

			}

		}while (response != 4);

	}


       void Menu() {

		System.out.println();
		System.out.println("Menu:");
		System.out.println("0. Print all contacts");
		System.out.println("1. Add a contact");
		System.out.println("2. Update/modify a contact");
		System.out.println("3. Delete a contact");
		System.out.println("4. Exit");
		System.out.println();

		System.out.print("Please enter the number of the option above you wish to select: ");

	}

             void cliInsert() {
			do{
				System.out.print("Please provide the first name of the contact: ");
				String fName = input.next();
				System.out.print("Please provide the last name of the contact: ");
				String lName = input.next();
				System.out.print("Please provide the phone number of the contact: ");
				String phone = input.next();

				DefaultContact newContact = new DefaultContact(fName,lName,phone);
				myList.insert(newContact);
				myList.save("myContacts.txt");

				System.out.print("Would you like to add another contact? ");


			}while (input.next().equalsIgnoreCase("Y"));
	}


		void cliRemove() {
			do{
				myList.print();
				System.out.print("Please provide the numerical position of the contact you wish to remove in the above list: ");
				int pos = input.nextInt();
				myList.remove(pos - 1);
				myList.print();
				myList.save("myContacts.txt");
				System.out.print("Would you like to remove another contact? ");

			}while (input.next().equalsIgnoreCase("Y"));
		}

		void cliUpdate() {
				myList.print();
				System.out.print("Please provide the numerical position of the contact you wish to update in the above list: ");
				int pos = input.nextInt();
				int response;
			do {
				System.out.println("1.Update first name\n2.Update last name\n3.Update phone number\n4.Back to main menu\n");
				System.out.print("Please provide the number of the action listed above that you wish to perform for the specified contact:");
				response = input.nextInt();
				System.out.println();

			switch (response) {

				case 1:
					System.out.print("Please provide the new first name of the contact: ");
					String fName = input.next();
					myList.updateFirstName(myList.getIndex(pos-1),fName);
					myList.save("myContacts.txt");
					break;

				case 2:
					System.out.print("Please provide the new last name of the contact: ");
					String lName = input.next();
					myList.updateLastName(myList.getIndex(pos-1),lName);
					myList.save("myContacts.txt");
					break;

				case 3:
					System.out.print("Please provide the new phone number of the contact: ");
					String phone = input.next();
					myList.updatePhone(myList.getIndex(pos-1),phone);
					myList.save("myContacts.txt");
					break;
				}
			}while (response != 4);
	}


                 public static void main(String[] args) throws IOException {

			new ContactListCLI();

		}

}
