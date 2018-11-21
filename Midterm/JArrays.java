/* Jarrays.java - Write a java program that creates an array,
   prints out the full contents of the array,
   and then prints out the 3rd item in the array. */

class JArrays {

	//main method
	public static void main(String[] args){

	//new String array
	String[] mySong = new String[] {"I waited till", "I saw the sun", "Don't know why", "I didn't come"};

	//printing out new line
	System.out.println();

		//specialized for loop to print out full contents of array
		for (String lyric : mySong) {
			System.out.println(lyric + " ");
		}

	//printing out 3rd item in array (n-1)
	System.out.println();
	System.out.println(mySong[2]);
	System.out.println();

	}

}
