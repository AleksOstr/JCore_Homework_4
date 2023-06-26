public class Product {
    private String productName;
    private int price;
    private Category category;

    public Product(String productName, int price, Category category) {
        this.productName = productName;
        this.price = price;
        this.category = category;
    }

    public String getProductName() {
        return productName;
    }

    public int getPrice() {
        return price;
    }

    public Category getCategory() {
        return category;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void setCategory(Category category) {
        this.category = category;
    }
}
enum Category {
    STANDART, PREMIUM
}
