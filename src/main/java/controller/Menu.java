package controller;
/*Make a phonebook application, users should be able to add
different people to the phonebook (name, phone number, email (optional)).
Users should be able to remove, find different contacts by name,
phone number or part of name of contact,
Users should be able to update contact.
Users should be able to see all contacts.*/

import java.util.Scanner;

public class Menu {
    PhoneBook phoneBook = new PhoneBook();
    Scanner scanner = new Scanner(System.in);

    public void showMenu() {
        String userInput;
        do {
            System.out.println("Choose activity:");
            System.out.println("1. See all contacts");
            System.out.println("2. Add new contact");
            System.out.println("3. Search contact");
            System.out.println("4. Update contact");
            System.out.println("5. Delete contact");

            System.out.println("Enter \"Q\" to quit.");
            System.out.print("Type here:");
            userInput = scanner.nextLine();

            switch (userInput.toLowerCase().trim()) {
                case "1":
                    phoneBook.showContacts();
                    System.out.println("\nPress Enter to continue.");
                    scanner.nextLine();
                    break;
                case "2":
                    phoneBook.addContact();
                    System.out.println("\nPress Enter to continue.");
                    scanner.nextLine();
                    break;
                case "3":
                    System.out.println("Search contact");
                    phoneBook.searchContact();
                    System.out.println("\nPress Enter to continue.");
                    scanner.nextLine();
                    break;
                case "4":
                    System.out.println("Update contact");
                    phoneBook.updateContact();
                    System.out.println("\nPress Enter to continue.");
                    scanner.nextLine();
                    break;
                case "5":
                    System.out.println("Delete contact");
                    phoneBook.deleteContact();
                    System.out.println("\nPress Enter to continue.");
                    scanner.nextLine();
                    break;
                case "q":
                    System.out.println("Exiting phonebook.");
                    break;
                default:
                    System.out.println("Try again!");
                    System.out.println("\nPress Enter to continue.");
                    scanner.nextLine();
                    break;
            }
        }
        while (!userInput.toLowerCase().trim().equalsIgnoreCase("q"));


    }


}
