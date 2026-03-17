package exercise1;

import exceptions.EmptySaleException;

public class TestIndexOutOfBoundsMain {
    public static void main(String[] args) {
        Sale sale1 = new Sale();

        sale1.getProducts().add(new Product("Apple", 1500.50));
        sale1.getProducts().add(new Product("Microsoft", 1289.50));
        sale1.getProducts().add(new Product("Acer", 899.50));

        try {
            Product product = sale1.getProducts().get(5);
            System.out.println("Selected product: "+ product.getName());
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Error catched" + e.getMessage());
        }

        System.out.println("The program continues later of catch the exception");

        Sale sale2 = new Sale();

        try {
            sale2.calculateTotal();
            System.out.println("Total of sale 2: " + sale2.getTotalPrice());
        } catch (EmptySaleException e) {
            System.out.println("Excepció catched: " + e.getMessage());
        }
    }

}
