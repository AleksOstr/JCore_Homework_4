import ShopExceptions.AmountException;
import ShopExceptions.CustomerException;
import ShopExceptions.ProductException;

import java.util.Scanner;

public class ShopMain {
    static Customer[] customers = {
            new Customer("Ivan Ivanov", 25, "79272457896"),
            new Customer("Petr Petrov", 36, "79345785214")};
    static Product[] products = {
            new Product("Milk", 80),
            new Product("Bread", 35),
            new Product("Water", 25),
            new Product("Meat", 500),
            new Product("Chicken", 250)};
    static Order[] orders = new Order[5];

    public static void main(String[] args) throws CustomerException, AmountException, ProductException {
        int ordersCount = 0;
        while (ordersCount < 5) {
            String phoneNumber = null;
            String productName = null;
            int amount;
            try {
                phoneNumber = prompt("Enter customer's phone number\n");
                productName = prompt("Enter product\n");
                amount = Integer.parseInt(prompt("Enter amount\n"));
                orders[ordersCount] = makeOrder(phoneNumber, productName, amount);
                ordersCount++;
            } catch (ProductException e) {
                System.out.println(e.getMessage());
            } catch (AmountException e) {
                orders[ordersCount] = makeOrder(phoneNumber, productName, 1);
                ordersCount++;
            } catch (CustomerException e) {
                e.printStackTrace();
                return;
            } finally {
                System.out.printf("Orders count: %d%n", ordersCount);
            }
        }

    }

    public static Order makeOrder(String phoneNumber, String productName, int amount)
            throws AmountException, CustomerException, ProductException {
        Customer customer = findByPhone(phoneNumber);
        Product product = findByProductName(productName);
        if (customer == null) throw new CustomerException("Customer does not exist");
        if (product == null) throw new ProductException("Product does not exist");
        if (amount >= 100 || amount < 1) throw new AmountException("Amount isn't correct");
        return new Order(customer, product, amount);
    }

    private static String prompt(String message) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(message);
        return scanner.nextLine();
    }

    private static Customer findByPhone(String phoneNumber) {
        Customer result = null;
        for (Customer c : customers) {
            if (c.getPhoneNumber().equals(phoneNumber)) {
                result = c;
            }
        }
        return result;
    }

    private static Product findByProductName(String productName) {
        Product result = null;
        for (Product p : products) {
            if (p.getProductName().equals(productName)) {
                result = p;
            }
        }
        return result;
    }
}
