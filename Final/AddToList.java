/*AddToList.java - Write a program that creates a list, prints the contents
out to the user.  Prompts them for something to add to the list.
Adds the user input to the list and then prints out the contents again.*/

import java.util.Scanner;
import java.util.ArrayList;

class AddToList {

        public static void main(String[] args) {

                Scanner userInput = new Scanner(System.in);
                ArrayList<String> myMusic = new ArrayList<String>();

		myMusic.add("pop");
		myMusic.add("rock");
		myMusic.add("folk");

		System.out.println("\nList of Music Genres: " + myMusic);

                System.out.print("\nPlease enter a music genre to add to the above list: ");
                myMusic.add(userInput.next());

		System.out.println("\nHere is your new list of Music Genres: \n\n" + myMusic + "\n");

                }
        }

