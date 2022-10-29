package cw2;

class CarTest {
    public static void main(String[] args) {
        Cart cart = new Cart();

        cart.addProduct(new Product("mleko", 1));
        cart.addProduct(new Product("czekolada", 2));
        cart.addProduct(new Product("chleb", 3));

        double cartCost = cart.totalCost();

        System.out.println("Koszt koszyka " + cartCost + "zł");
    }
}
