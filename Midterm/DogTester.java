class DogTester {

	//main method
	public static void main (String[] args) {

	//variables with new values
	String newColor = "white";
	int newAge = 4;

	//testing constructor
	Dog myDog = new Dog();

	//testing setter with variable (new value)
	myDog.setColor(newColor);
	myDog.setAge(newAge);

	//testing getter within print statement
	System.out.println("Dog Color: " + myDog.getColor() + ". Dog Age: " + myDog.getAge());

	//testing overloaded constructor
	Dog myNewDog = new Dog(5, "orange");
	System.out.println("New Dog Color: " + myNewDog.getColor() + ". New Dog Age: " + myNewDog.getAge());

	}
}
