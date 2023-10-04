package Manager;

import java.util.ArrayList;
public class Main {

    public static void main(String[] args) {
        ArrayList<Contact> lc = new ArrayList<>();
        Manager Manager = new Manager();
        while (true) {
            int choice = Manager.menu();
            switch (choice) {
                case 1:
                    Manager.createContact(lc);
                    break;
                case 2:
                    Manager.printAllContact(lc);
                    break;
                case 3:
                    Manager.deleteContactd(lc);
                    break;
                case 4:
                    return;
            }
        }
    }
}