class AlphaColorTester {

	public static void main(String[] args) {

		int myRed = 0;
		int myGreen = 255;
		int myBlue = 0;
		int myAlpha = 0;

AlphaColor myColor = new AlphaColor(myRed,myGreen,myBlue,myAlpha);

		myColor.setRed(255);
		int r = myColor.getRed();
		int g = myColor.getGreen();
		int b = myColor.getBlue();
		int a = myColor.getAlpha();

	System.out.println("Color:" + r + " " + g + " " + b + " " + a);

	}
}
