class Product {
    private String productName;
    private double price;

    public void setProductName(String name) {
        this.productName = name;
    }

    public void setPrice(double price) {
        if (price > 0)
            this.price = price;
        else
            System.out.println("Invalid price. Must be greater than 0.");
    }

    public String getProductName() {
        return productName;
    }

    public double getPrice() {
        return price;
    }
}
public class ProductApp {
    public static void main(String[] args) {
        Product product = new Product();

        product.setProductName("Bluetooth Speaker");
        product.setPrice(59.99);

        System.out.println("Product Name: " + product.getProductName());
        System.out.println("Price: $" + product.getPrice());
    }
}
