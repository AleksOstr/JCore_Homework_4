import java.util.Objects;

public class Customer {
    String fullName;
    int age;
    String phoneNumber;

    public Customer(String fullName, int age, String phoneNumber) {
        this.fullName = fullName;
        this.age = age;
        this.phoneNumber = phoneNumber;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Customer that = (Customer) obj;
        if (age != that.age || !phoneNumber.equals(that.phoneNumber)) return false;
        return Objects.equals(fullName, that.fullName);
    }
}
