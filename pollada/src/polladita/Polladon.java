package polladita;

public class Polladon {

	public static void main(String[] args) {
        System.out.println("QuickDelivery App Example:\n");
        User user = new User("Ana Perez", "ana@email.com");
        Product product = new Product("Pizza", 25.0);
        Order order = new Order(user, product, 2);
        System.out.println(order);
	}

}