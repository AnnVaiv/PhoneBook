/*Make a phonebook application, users should be able to add
different people to the phonebook (name, phone number, email (optional)).
Users should be able to remove, find different contacts by name,
phone number or part of name of contact,
Users should be able to update contact.
Users should be able to see all contacts.

Maybe a menu could be added to make things easier for users.
*/

import controller.Menu;

public class Main {
    public static void main(String[] args) {

        System.out.println("My personal phonebook.");
        Menu menu = new Menu();
        menu.showMenu();

    }
}
