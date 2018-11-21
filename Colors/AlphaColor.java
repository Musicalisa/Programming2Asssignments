
//if you can say this __ is a ____ , then there is inheritance occuring, and there is also the idea of polymorphismm (many forms)
//Object is the very general class, it is simply a thing that can have things
//constructor says "this is how you put it together"
//methods are actions that object can perform after it is constructed (operating instructions).

class AlphaColor extends BasicColor {

 int a;

	//the default constructor is a method with the same name as the class that accepts nothing.
	AlphaColor() {
		r = 0;
		g = 0;
		b = 0;
		a = 0;

	}

	//overloaded constructor
	//for pastel color class constructor, set boundaries
	//class pastel color inherits from BasicColor
	AlphaColor(int red, int green, int blue, int alpha) {
		r = red;
		g = green;
		b = blue;
		a = alpha;

	}
	void setAlpha(int alpha) {

		a = alpha;

	}

	int getAlpha() {

		return a;

	}

//setters and getters for r,g,and b are inherited, so we just write a setter and getter for alpha, which is the new feature.


	//an overriden method has the same name as the method used before, but you say "this is what is does instead". 
	//this says if you call setAll and only give it a r,g,b,  alpha will be zero. This is overwriting
	void setAll(int red, int green, int blue) {

		r = red;
		g = green;
		b = blue;
		a = 0;

	}

	//this is an overloaded method for when they pass in four parameters.
	void setAll(int red, int green, int blue, int alpha) {

		r = red;
		g = green;
		b = blue;
		a = alpha;

		}

	}

