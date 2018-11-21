/* RollerCoaster.java - Write a java program that uses two different loops
   to mimic the sounds or a rollercoaster.  Eg.  Click, Click, Click,
   Wheee!, Wheee!, Wheee! */

class RollerCoaster {

//main method
public static void main (String[] args) {

	//new String array
	String[] coasterUp = new String[] {"click","click","click"};

	//printing new line
	System.out.println();

		//specialized for loop to print out array contents
		for (String line : coasterUp) {
			System.out.println(line + " ");
		}

	//new variable declaration/initialization
	String coasterDown = "whee";

		//while loop
		int count = 1;
		while (count < 4) {
			System.out.println(coasterDown);
			count++;
		}
	//printing out new line
	System.out.println();

	}
}
