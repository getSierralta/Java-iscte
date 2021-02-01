package A_11JavaCollectorsFramework;

import java.util.ArrayList;

public class Contact {
	/**
	 * Our contact fields
	 */
	private final String name;
	private final int phoneNumber;
	private final String email;

	/**
	 *
	 * @param name of the owner of the phone number
	 * @param phoneNumber of the owner
	 * @param email of the owner
	 */
	public Contact(String name, int phoneNumber, String email) {
		this.name = name;
		this.phoneNumber = phoneNumber;
		this.email = email;
	}

	/**
	 * Getters
	 * @return the different fields of our contact
	 */
	public String getName() {
		return name;
	}

	public int getPhoneNumber() {
		return phoneNumber;
	}

	public String getEmail() {
		return email;
	}

	/**
	 * It prints all the contacts inside a list of contacts
	 * @param contacts list of contacts
	 */
	public static void printContacts(ArrayList<Contact> contacts){
		System.out.println("\n");
		for (Contact contact : contacts) {
			System.out.println(contact);
		}
	}
	/**
	 *
	 * @return the information of our contact
	 */
	@Override
	public String toString() {
		return getName()+" |\tPhone Number: "+getPhoneNumber()+" |\tEmail: "+getEmail();
	}

	public static void main(String[] args) {
		//We create a new list of Contacts
		ArrayList<Contact> contacts = new ArrayList<>();
		//We instantiate some Contacts
		Contact joao = new Contact("Joao Silva", 910000000,"joao.silva@gmail.com");
		Contact pedro = new Contact("Pedro Fernandez",910000001,"pedro.fernandez@gmail.com");
		Contact maria = new Contact("Maria Rita", 910000002,"maria.ritinha@gmail.com");
		//We add the contacts to our list
		contacts.add(joao);
		contacts.add(pedro);
		contacts.add(maria);
		//We print our contacts to see whats' inside the list
		printContacts(contacts);
		//We remove a contact to check if our method is working
		contacts.remove(pedro);
		//We print the contacts again to see what's inside the list
		printContacts(contacts);
	}
}
