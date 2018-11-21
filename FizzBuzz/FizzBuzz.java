import java.util.Scanner;

class FizzBuzz {

	public static void main(String[] args) {
	Scanner user_input = new Scanner(System.in);

	int number;
	System.out.println();
	System.out.print("Please provide a number: ");
	number = user_input.nextInt();

	if (number % 3 == 0 && number % 5 == 0) {
		System.out.println();
		System.out.println("Fizzbuzz");
		System.out.println();
	}else if (number % 3 == 0) {
		System.out.println();
		System.out.println("Fizz");
		System.out.println();
	}else if (number % 5 == 0) {
		System.out.println();
		System.out.println("Buzz");
		System.out.println();
	}else {
		System.out.println();
		System.out.println("The number you have entered is not divisible by 3 or 5.");
		System.out.println();
	}
    }
}
