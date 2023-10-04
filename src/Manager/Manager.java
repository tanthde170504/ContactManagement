package Manager;

import java.util.ArrayList;

public class Manager {
    private Validation validation = new Validation();

    public int menu() {
        System.out.println("1. Add a contact.");
        System.out.println("2. Display all contacts.");
        System.out.println("3. Delete a contact.");
        System.out.println("4. Exit");
        System.out.print("Enter your choice: ");
        int choice = validation.checkInputIntLimit(1, 4);
        return choice;
    }

    public void createContact(ArrayList<Contact> contactList) {
        System.out.print("Enter contact ID: ");
        int contactId = validation.checkInputInt();
        System.out.print("Enter first name: ");
        String firstName = validation.checkInputString();
        System.out.print("Enter last name: ");
        String lastName = validation.checkInputString();
        System.out.print("Enter group: ");
        String group = validation.checkInputString();
        System.out.print("Enter address: ");
        String address = validation.checkInputString();
        System.out.print("Enter phone: ");
        String phone = validation.checkInputPhone();
        Contact newContact = new Contact(contactId, firstName + lastName, group, address, phone, firstName, lastName);
        contactList.add(newContact);
        System.err.println("Contact added successfully.");
    }

    public void printAllContacts(ArrayList<Contact> contactList) {
        System.out.printf("%-5s%-25s%-20s%-20s%-20s%-20s%-20s\n", "ID", "Name", "First name", "Last name", "Group", "Address", "Phone");
        for (Contact contact : contactList) {
            System.out.printf("%-5d%-25s%-20s%-20s%-20s%-20s%-20s\n", contact.getContactId(), contact.getFullName(), contact.getFirstName(), contact.getLastName(), contact.getGroup(), contact.getAddress(), contact.getPhone());
        }
    }

    public void deleteContact(ArrayList<Contact> contactList) {
        System.out.print("Enter contact ID: ");
        int idToDelete = validation.checkInputInt();
        Contact contactToDelete = getContactById(contactList, idToDelete);
        if (contactToDelete == null) {
            System.err.println("Contact not found.");
            return;
        } else {
            contactList.remove(contactToDelete);
        }
        System.err.println("Contact deleted successfully.");
    }

    public Contact getContactById(ArrayList<Contact> contactList, int id) {
        for (Contact contact : contactList) {
            if (contact.getContactId() == id) {
                return contact;
            }
        }
        return null;
    }

    void printAllContact(ArrayList<Contact> lc) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    void deleteContactd(ArrayList<Contact> lc) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}