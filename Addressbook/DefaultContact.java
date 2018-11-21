import java.util.Arrays;
import java.util.*;

class DefaultContact implements PhoneContact {

	String firstName;
	String lastName;
	String phone;

	DefaultContact(String fName,String lName,String num) {

		firstName = fName;
		lastName = lName;
		phone = num;

	}

	DefaultContact(DefaultContact myContact) {

	}

	DefaultContact(String line) {

	}


	public void setFirstName(String fName){

		firstName = fName;

	}

	public String getFirstName() {

		return(firstName);

	}

	public void setLastName(String lName){

		lastName = lName;

	}

	public String getLastName() {

		return(lastName);

	}

	public void setPhone(String num) {

		phone = num;

	}

	public String getPhone() {
		return(phone);

	}

	@Override
	public String toString() {

		String contact = (firstName + ", " + lastName + ", " + phone + "\n");
		return contact;
	}

}

