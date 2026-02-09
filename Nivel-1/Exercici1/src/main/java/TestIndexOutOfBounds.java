import java.util.ArrayList;

public class TestIndexOutOfBounds {
    public static void main(String[] args) {
        Sale sale = new Sale();

        sale.getProducts().add(new Product("Apple", 1500.50));
        sale.getProducts().add(new Product("Microsoft", 1289.50));
        sale.getProducts().add(new Product("Acer", 899.50));

        try {
            Product p = sale.getProducts().get(5);
            System.out.println("Selected product: "+ p.getName());
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Error catched" + e.getMessage());
        }

        System.out.println("The program continues later of catch the exception");
    }
}
