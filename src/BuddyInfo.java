public class BuddyInfo {
    private String name;
    private String address;
    private long number;

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public long getNumber() {
        return number;
    }

    public BuddyInfo() {
        name = "John Doe";
        address = "122 Moon street";
        number = 6130001111L;
    }

    public BuddyInfo(String name, String address, long number) {
        this.name = name;
        this.address = address;
        this.number = number;
    }

    public static void main(String[] args) {
        System.out.println("Hello World!");
        BuddyInfo buddy = new BuddyInfo("Homer", "121 Moon street", 6131110000L);
        System.out.println("Hello " + buddy.getName());
    }
}
