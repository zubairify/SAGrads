
public class TestShopping {

	public static void main(String[] args) {
		Product p1 = new Product("iPhone", 2000);
		
		ShoppingCart cart = new ShoppingCart();
		
		cart.addProduct(p1);
		cart.addProduct(new Product("iWatch", 900));
		cart.addProduct(new Product("iPad", 1250));
		
		cart.showOrder();
	}
}
