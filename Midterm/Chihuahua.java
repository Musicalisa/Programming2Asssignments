/* Chihuahua.java - The Chihuahua class should be a subclass of Dog
   and should include an additional field, setters and getters for that field,
   and overwrite the additional method from Dog.java. */

class Chihuahua extends Dog{

	//new field
	int height;

	//default constructor
	Chihuahua() {

	}

	//setter
	void setHeight (int h) {
		height = h;
	}

	//getter
	int getHeight() {
		return height;
	}

	//overwritten method
	Chihuahua(int a, String c) {
		age = a;
		Color = c;
		height = 2;
	}
}
