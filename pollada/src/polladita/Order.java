package polladita;

public class Order {
    private User user;
    private Product product;
    private int quantity;

    public Order(User user, Product product, int quantity) {
        this.user = user;
        this.product = product;
        this.quantity = quantity;
    }

    public User getUser() {
        return user;
    }

    public Product getProduct() {
        return product;
    }

    public int getQuantity() {
        return quantity;
    }

    public double getTotal() {
        return product.getPrice() * quantity;
    }

    @Override
    public String toString() {
        return "Order{" +
                "user=" + user +
                ", product=" + product +
                ", quantity=" + quantity +
                ", total=" + getTotal() +
                '}';
    }
}
