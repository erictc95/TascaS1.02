package exercise1;

import exceptions.EmptySaleException;

public class SalesDemoMain {
    public static void main(String[] args) {
        SalesDemoService demoService = new SalesDemoService();

        demoService.runIndexOutOfBoundsDemo();
        demoService.runEmptySaleDemo();
    }
}

