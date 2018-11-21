class BasicAddress {
	//variable declarations
	int houseNum ;
	String street;
	int zipCode;

	//redefining the default constructor
	BasicAddress() {
		houseNum = 507;
		street = "Bill St.";
		zipCode = 75068;
	}

	//setting up an overloaded default constructor
	BasicAddress(int num, String streetn, int code) {
		houseNum = num;
		street = streetn;
		zipCode = code;
	}

	//individual setters
	void setNum(int num) {
		houseNum = num;
	}

	void setStreetn(String streetn) {
		street = streetn;
	}

	void setCode(int code) {
		zipCode = code;
	}


	//individual getters
	int getNum() {
		return houseNum;
	}

	String  getStreetn() {
		return street;
	}

	int getCode() {
		return zipCode;
	}
}



