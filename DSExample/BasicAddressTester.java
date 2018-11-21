class BasicAddressTester {
//tests the functionality of the program. It handles the interfacing. BasicAddress.java's job, on the other hand, was just to hold data.
	public static void main (String[] args) {

//making a new instance of Basic Address called myAddress by calling the default constructor
BasicAddress myAddress = new BasicAddress();
		//printing out default address \n
		System.out.println();
		System.out.println("Address: " + myAddress.getNum() + " " + myAddress.getStreetn() + " " + myAddress.getCode());
		System.out.println();

//creating a new instance of Basic Address called myNewAddress by calling overloaded constructor
BasicAddress myNewAddress = new BasicAddress(672, "Lee Ln.", 75003);
		//printing out myNewAddress \n
		System.out.println("Address: " + myNewAddress.getNum() + " " + myNewAddress.getStreetn() + " " + myNewAddress.getCode());
		System.out.println();

//declaring new values
		int myNum = 527;
		String myStreetn = "Ann St.";
		int myCode = 75035;

//creating a new instance of BasicAddress called myOtherAddress by passing in the values stated above
BasicAddress myOtherAddress = new BasicAddress(myNum, myStreetn, myCode);
		//printing out myOtherAddress \n
		System.out.println("Address: " + myOtherAddress.getNum() + " " + myOtherAddress.getStreetn() + " " + myOtherAddress.getCode());
		System.out.println();

//individual setters for myOtherAddress (just in case I want to change these variables individually)
		myOtherAddress.setNum(myNum);
		myOtherAddress.setStreetn(myStreetn);
		myOtherAddress.setCode(myCode);

//individual getters for new values
		int num = myOtherAddress.getNum();
		String streetn = myOtherAddress.getStreetn();
		int code = myOtherAddress.getCode();

		//printing out address with new values
		System.out.println("Address: " + num  + " " + streetn + " " + code);
		System.out.println();

	}

}

