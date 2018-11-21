class PastelColorTester {

	public static void main (String[] args ) {

		int myRed = 0;
		int myGreen = 254;
		int myBlue = 10;


PastelColor myPastel = new PastelColor(myRed,myGreen,myBlue);

		myPastel.setRed(177);

		int r = myPastel.getRed();
		int g = myPastel.getGreen();
		int b = myPastel.getBlue();

System.out.println("Color:" + r + " " + g + " " + b);

PastelColor myNewPastel = new PastelColor(155,165,200);
System.out.println("Color: " + myNewPastel.getRed() + " " + myNewPastel.getGreen() + " " + myNewPastel.getBlue());
		System.out.println();

	}
}
