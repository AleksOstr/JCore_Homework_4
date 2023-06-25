public class Customer {
    private String fullName;
    private int age;
    private String phoneNumber;

    public Customer(String fullName, int age, String phoneNumber) {
        this.fullName = fullName;
        this.age = age;
        this.phoneNumber = phoneNumber;
    }

    public String getFullName() {
        return fullName;
    }

    public int getAge() {
        return age;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }
}
