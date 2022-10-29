package cw2;

public class Cart {

    private static final int MAX_PRODUCTS = 10;
    private Product[] products = new Product[MAX_PRODUCTS];
    private int productCount;

    boolean addProduct(Product product) {
        if (productCount < MAX_PRODUCTS) {
            products[productCount] = product;
            productCount++;
            return true;
        } else {
            return false;
        }
    }

    private double sumPrices(int counter) {
        if (productCount ==0)
            return 0;
        else if(counter < (productCount -1))
            return products[counter].getPrice() + sumPrices(++counter);
        else
            return products[counter].getPrice();
    }

    double totalCost() {
        return sumPrices(0);
    }

}
