class PastelColor extends BasicColor {

	PastelColor(){
		r = 200;
		g = 255;
		b = 255;

	}

	PastelColor(int red, int green, int blue){

		if (red >= 150 && red <= 255) {
			r = red;
		}else {
			System.out.println(red + " is not a valid red pastel color.");
		}if (green >= 150 && green <= 255) {
			g = green;
		}else {
			System.out.println(green + " is not a valid green pastel color.");
		}if (blue >= 150 && blue <= 255) {
			b = blue;
		}else {
			System.out.println(blue + " is not a valid blue pastel color.");
		}
	}


	void setRed(int red){
		if (red >= 150 && red <= 255) {
			r = red;
		}else {
			System.out.println("Not a valid pastel color.");
		}
	}
	void setGreen(int green){
		if (green >= 150 && green <= 255) {
			g = green;
		}else {
			System.out.println("Not a valid pastel color.");
		}
	}
	void setBlue(int blue){
		if (blue >= 150 && blue <= 255) {
			b = blue;
		}else {
			System.out.println("Not a valid pastel color.");
		}
	}

}

