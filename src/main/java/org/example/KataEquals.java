package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class KataEquals {

	public static void main(String[] args) {
		Agenda agenda = new Agenda();
		agenda.addContact("Jose");
		agenda.addContact("Ana");
		agenda.addContact("Jose");
		System.out.println(agenda.contactList.size());
	}

	public static class Agenda{
		List<Contact> contactList = new ArrayList<>();

		public void addContact(String name){
			Contact contact = new Contact(name);
			if(!contactList.contains(contact)) contactList.add(contact);
		}
	}

	public static class Contact{
		private final String name;

		public Contact(String name) {
			this.name = name;
		}

		@Override
		public boolean equals(Object o) {
			if (this == o) return true;
			if (o == null || getClass() != o.getClass()) return false;
			return Objects.equals(name, ((Contact) o).name);
		}

	}
}
