package exercise1;

import exceptions.EmptySaleException;

public class SalesDemoMain {
    public static void main(String[] args) {
        runIndexOutOfBoundsDemo();
        runEmptySaleDemo();
    }

    private static void runIndexOutOfBoundsDemo() {
        Sale sale = createSampleSale();

        try {
            Product product = sale.getProducts().get(5);
            System.out.println("Selected product: " + product.getName());
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Error caught" + e.getMessage());
        }
        System.out.println("Program continues after catching exception");
    }

    private static void runEmptySaleDemo() {
        Sale sale = new Sale();

        try {
            sale.calculateTotal();
            System.out.println("Total of sale 2: " + sale.getTotalPrice());
        } catch (EmptySaleException e) {
            System.out.println("Excepció catched: " + e.getMessage());
        }

    }

    private static Sale createSampleSale() {
        Sale sale = new Sale();
        sale.getProducts().add(new Product("Apple", 1500.50));
        sale.getProducts().add(new Product("Microsoft", 1289.50));
        sale.getProducts().add(new Product("Acer", 899.50));
        return sale;
    }
}

