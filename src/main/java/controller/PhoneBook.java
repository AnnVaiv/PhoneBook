package controller;

import entity.Contact;

import java.util.*;

public class PhoneBook {
    ArrayList<Contact> contacts = new ArrayList<>();
    Scanner scanner = new Scanner(System.in);

    public void showContacts() {
        System.out.println("\nAll contacts");
        System.out.println("Name\t|\tSurname\t|\temail\t|\tphone");

        Collections.sort(contacts, Comparator.comparing(Contact::getName)
                .thenComparing(Contact::getSurname));

        for (Contact currentContact : getContactInfo()) {
            System.out.println(currentContact.getName() +
                    "\t|\t" + currentContact.getSurname() +
                    "\t|\t" + currentContact.getEmail() +
                    "\t|\t" + currentContact.getPhone());
        }

    }

    public ArrayList<Contact> getContactInfo() {
        return contacts;
    }

    public void addContact() {
        System.out.println("\nAdd new contact");
        System.out.print("Enter name: ");
        String name = scanner.nextLine();
        System.out.print("Enter surname: ");
        String surname = scanner.nextLine();
        System.out.print("Enter email: ");
        String email = scanner.nextLine();
        System.out.print("Enter phone: ");
        String phone = scanner.nextLine();

        Contact contact = new Contact(name, surname, email, phone);
        System.out.println(createContact(contact));
    }

    private String createContact(Contact newContact) {
        contacts.add(newContact);
        return "New contact added: " + newContact.getName() + " " + newContact.getSurname();
    }

    public void searchContact() {
        System.out.println("\nSearch contact");
        System.out.print("Type here: ");
        String searchFor = scanner.nextLine();
        for (Contact contact:contacts){
            //System.out.println(contacts.contains("an"));

        }
        //System.out.println(Arrays.stream(contacts).anyMatch(searchFor::equals));
        /*if (contacts.contains(Objects.searchFor)){
            System.out.println("Contacts found:\n"+contacts.contains(searchFor));//         THIS DO NOT WORK!!!
        //(contacts.contains(searchFor)));
        }else {
            System.out.println(searchFor+" not found!");
        }*/

    }

    public void updateContact() {
        System.out.println("Update contact");
        System.out.print("Type here: ");
        int contactID = Integer.parseInt(scanner.nextLine());
    }

    public void deleteContact() {
        System.out.println("\nDelete contact");
        System.out.print("Type here: ");
        int contactID = Integer.parseInt(scanner.nextLine());
    }

    public void getSingleContact() {
        System.out.println("Single contact");

    }

}
