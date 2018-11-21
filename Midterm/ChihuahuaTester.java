class ChihuahuaTester {

	//main method
	public static void main (String[] args) {

	//variable with new value
	int newHeight = 10;

	//calling default constructor
	Chihuahua myLittleDog = new Chihuahua();

	//setting new value with variable
	myLittleDog.setHeight(newHeight);

	//getting new value inside print statement
	System.out.println("Dog Height: " +myLittleDog.getHeight());

	//testing overwritten method
	Chihuahua myMiniDog = new Chihuahua(4,"purple");
	System.out.println("Dog Color: " + myMiniDog.getColor() + ". Dog Age: " + myMiniDog.getAge() + ". Dog Height: " + myMiniDog.getHeight());

	}
}
