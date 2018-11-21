class BasicColorTester {

	public static void main(String[] args){

		int myRed = 0;
		int myGreen = 0;
		int myBlue = 0;
		BasicColor myColor = new BasicColor(myRed,myGreen,myBlue);

		System.out.println("Color: " + myColor.getRed() + " " + myColor.getGreen() + " " + myColor.getBlue() + " ");

		myColor.setRed(myRed);
		myColor.setGreen(myGreen);
		myColor.setBlue(myBlue);

		int red = myColor.getRed();
		int green = myColor.getGreen();
		int blue = myColor.getBlue();

		System.out.println("Color: " + red + " " + green + " " + blue + ".");

	}

}
