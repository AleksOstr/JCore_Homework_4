public class Order {
    private Customer customer;
    private Product product;
    private int amount;
    private int cost;

    public Order(Customer customer, Product product, int amount) {
        this.customer = customer;
        this.product = product;
        this.amount = amount;
        this.cost = product.getPrice() * amount;
    }

    public Customer getCustomer() {
        return customer;
    }

    public Product getProduct() {
        return product;
    }

    public int getAmount() {
        return amount;
    }

    public int getCost() {
        return cost;
    }
}
