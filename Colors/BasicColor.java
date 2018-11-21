

class BasicColor {

	//Variable Declaration
	int r,g,b;

	void setRed(int red){
		r = red;
	}

	BasicColor(){
		r = 0;
		g = 0;
		b = 0;
	}

	BasicColor(int red, int green, int blue){
		r = red;
		g = green;
		b = blue;
	}

	void setGreen(int green){
		g = green;
	}

	void setBlue(int blue){
		b = blue;
	}

	int getRed(){
		return r;
	}

	int getGreen(){
		return g;
	}

	int getBlue(){
		return b;
	}

	//this gives the functionality of the overloaded constructor, but it can be called at any time after it is constructed to change all variables
	void setAll(int red, int green, int blue) {

		r = red;
		g = green;
		b = blue;
}
}
