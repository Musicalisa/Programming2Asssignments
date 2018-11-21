class DefaultContactTester {

	public static void main (String[] args) {

		DefaultContact myContact = new DefaultContact("Tom","Jones", "214-998-5589");

		myContact.setFirstName("Henry");
		System.out.println(myContact.getFirstName());
		myContact.setLastName("Smith");
		System.out.println(myContact.getLastName());
		myContact.setPhone("345-678-9012");
		System.out.println(myContact.getPhone());

		System.out.println(myContact);


	}
}
