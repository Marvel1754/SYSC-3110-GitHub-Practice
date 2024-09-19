// Testing Git pull in IntelliJ

import java.util.ArrayList;

public class AddressBook {
    private ArrayList<BuddyInfo> buddyInfos;

    public AddressBook() {
        buddyInfos = new ArrayList<BuddyInfo>();
    }

    /**
     * Adds a Buddy to the list of buddies in the address book.
     * @param buddy buddy to be added to the address book.
     */
    public void addBuddy(BuddyInfo buddy) {
        if (buddy != null) {
            buddyInfos.add(buddy);
        }
    }

    public void dummyMethod() {

    }

    /**
     * Remove a buddy from the address book.
     * @param buddy buddy to be removed from the address book.
     */
    public void removeBuddy(BuddyInfo buddy) {
        buddyInfos.remove(buddy);
    }

    public static void main(String[] args) {
        System.out.println("Address Book");

        AddressBook addressBook = new AddressBook();
        BuddyInfo aBuddy = new BuddyInfo();
        addressBook.addBuddy(aBuddy);
        addressBook.removeBuddy(aBuddy);
    }
}
