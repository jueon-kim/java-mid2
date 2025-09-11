package collection.map.test.cart;

public class CartMain {

    public static void main(String[] args) {
        Cart cart = new Cart();
        cart.add(new Product("사과", 1000), 1);
        cart.add(new Product("사과", 1000), 1);
        cart.printAll();

        cart.add(new Product("사과", 1000), 1);
        cart.printAll();
        cart.add(new Product("사과", 1000), 1);
        cart.printAll();


    }
}
