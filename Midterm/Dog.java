/* Dog.java - Create a dog java class that contains at least 2 fields,
   a constructor, setters and getters for at least one of the fields,
   and an additional method. */

class Dog {

	//2 fields
	int age;
	String Color;

	//default constructor
	Dog() {
		Color = "brown";
	}

	//setters
	void setColor(String c) {
		Color = c;
	}

	void setAge(int a) {
		age = a;
	}

	//getters
	String getColor() {
		return Color;
	}

	int getAge() {
		return age;
	}

	//extra method (overloaded constructor)
	Dog(int a, String c) {
		age = a;
		Color = c;
	}

}
