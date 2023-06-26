public class Customer {
    private String fullName;
    private int age;
    private String phoneNumber;
    private Gender gender;

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

    public Gender getGender() {
        return gender;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }
}

enum Gender {
    MALE, FEMALE
}
