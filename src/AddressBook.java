import java.util.ArrayList;

public class AddressBook {
    private ArrayList<BuddyInfo> buddyInfos;

    public AddressBook() {
        buddyInfos = new ArrayList<BuddyInfo>();
    }

    /**
     * Adds a Buddy to the list of buddies in the address book.
     * @param buddy: BuddyInfo object to add a buddy.
     */
    public void addBuddy(BuddyInfo buddy) {
        buddyInfos.add(buddy);
    }

    /**
     * Remove a buddy from the address book.
     */
    public void removeBuddy(BuddyInfo buddy) {
        buddyInfos.remove(buddy);
    }

    public static void main(String[] args) {
        System.out.println("Address Book");

        AddressBook myBuddies = new AddressBook();
        BuddyInfo aBuddy = new BuddyInfo();
        myBuddies.addBuddy(aBuddy);
        myBuddies.removeBuddy(aBuddy);

    }
}
