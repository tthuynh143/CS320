public class Contact {

	private String Id;
	private String firstName;
	private String lastName;
	private String phoneNumber;
	private String address;




	public Contact(String contactId, String firstName, String lastName, String phoneNumber, String address) {

		if (contactId == null || contactId.length() > 10) {
			throw new IllegalArgumentException("ID Is Invalid");
		}

		if (firstName == null || firstName.length() > 10) {
			throw new IllegalArgumentException("First Name Is Invalid");
		}

		if (lastName == null || lastName.length() > 10) {
			throw new IllegalArgumentException("Last Name Is Invalid");
		}

		if (phoneNumber == null || phoneNumber.length() != 10) {
			throw new IllegalArgumentException("Phone Number Is Invalid");
		}

		if (address == null || address.length() > 30) {
			throw new IllegalArgumentException("Address Is Invalid");
		}

		this.contactId = contactId;
		this.firstName = firstName;
		this.lastName = lastName;
		this.phoneNumber = phoneNumber;
		this.address = address;
	}


	public String getId() {
		return contactId;
	}
	public String getFirstName() {
		return firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public String getAddress() {
		return address;
	}

	public void setFirstName(String firstName) {
		if (firstName == null || firstName.length() > 10) {
			throw new IllegalArgumentException("First Name Is Invalid");
		}
		this.firstName = firstName;
	}
	public void setLastName(String lastName) {
		if (lastName == null || lastName.length() > 10) {
			throw new IllegalArgumentException("Last Name Is Invalid");
		}
		this.lastName = lastName;
	}
	public void setPhoneNumber(String newPhoneNumber) {
		if (newPhoneNumber == null || newPhoneNumber.length() != 10) {
			throw new IllegalArgumentException("Phone Number Is Invalid");
		}
		this.phoneNumber = phoneNumber;
	}
	public void setAddress(String newAddress) {
		if (newAddress == null || newAddress.length() > 30) {
			throw new IllegalArgumentException("Address Is Invalid");
		}
		this.address = newAddress;
	}
}
