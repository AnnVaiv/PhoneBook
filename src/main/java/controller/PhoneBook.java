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
        //System.out.println("");


        String fullname = name+" "+surname;

        Contact contact = new Contact(name, surname, email, phone, fullname);
        System.out.println(createContact(contact));
    }

    private String createContact(Contact newContact) {
        contacts.add(newContact);
        return "New contact added: " + newContact.getFullname()/*newContact.getName()+" "+newContact.getSurname()*/;
    }

    public void searchContact() {
        System.out.println("\nSearch contact");
        System.out.print("Type here: ");
        String searchFor = scanner.nextLine();
        System.out.println("Name\t|\tSurname\t|\temail\t|\tphone");
        boolean check = false;

        for (Contact contact:contacts){
            if (contact.getName().toLowerCase().contains(searchFor.toLowerCase())||
                    contact.getSurname().toLowerCase().contains(searchFor.toLowerCase())||
                    contact.getEmail().toLowerCase().contains(searchFor.toLowerCase())||
                    contact.getPhone().toLowerCase().contains(searchFor.toLowerCase())||
                    contact.getFullname().toLowerCase().contains(searchFor.toLowerCase())){
                check = true;
                System.out.println(contact.getName() +
                        "\t|\t" + contact.getSurname() +
                        "\t|\t" + contact.getEmail() +
                        "\t|\t" + contact.getPhone());
            }
            if (check ==false){
                System.out.println("No contact \""+searchFor+"\" found");
            }

        }

    }

    public void updateContact() {
        System.out.println("\nUpdate contact");
        System.out.print("Type here: ");
        int contactID = Integer.parseInt(scanner.nextLine());

        System.out.print("Enter new name: ");
        String newname = scanner.nextLine();
        System.out.print("Enter new surname: ");
        String newsurname = scanner.nextLine();
        System.out.print("Enter new email: ");
        String newemail = scanner.nextLine();
        System.out.print("Enter new phone: ");
        String newphone = scanner.nextLine();

        String newfullname = newname+" "+newsurname;
        Contact updatedContact=new Contact(newname,newsurname, newemail,newphone,newfullname);

        Contact oldContact = this.contacts.get(contactID);
        oldContact.setName(updatedContact.getName());
        oldContact.setSurname(updatedContact.getSurname());
        oldContact.setEmail(updatedContact.getEmail());
        oldContact.setPhone(updatedContact.getPhone());
        oldContact.setFullname(updatedContact.getFullname());
        System.out.println("Contact updated: " + oldContact.getFullname());

    }



    public void deleteContact() {
        System.out.println("\nDelete contact");
        System.out.print("Type here: ");
        int contactID = Integer.parseInt(scanner.nextLine());
    }

    public void getSingleContact() {
        System.out.println("\nSingle contact");

    }

}
