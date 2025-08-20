package day5_.association.hasa;

import day3_.scannerdemo.Person;

public class Exceutor {

	public static void main(String[] args) {
		Address address = new Address("405 Laxmi Enclave, Pandit Colony", "Nashik", "Maharashtra", "422003");
		Person person = new Person();
		person.displayInfo();
	}
}
