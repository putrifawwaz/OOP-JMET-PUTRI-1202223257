public class User {
    // TODO: Create Private Attribute of User (Name and Phone Number) then Create Setter method for each attribute
    private String name;
    private int phoneNumber;

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getPhoneNumber() {
        return phoneNumber;
    }
    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
    

    // TODO: Create Method to Register User and Display User's Name and Phone Number and success message
    public void displayConcertInfo() {
        System.out.println("=== Copncert Information ===");
        System.out.println("Name            : " + name);
        System.out.println("Phone Number    : " + phoneNumber);
        System.out.println(name + "Succesfully Registered!");
    }

}
