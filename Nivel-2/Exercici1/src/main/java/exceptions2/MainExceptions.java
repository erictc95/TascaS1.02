package exceptions2;

import java.util.Scanner;

public class MainExceptions {


    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Leer un byte
        byte b = ConsoleReader.readByte("Enter a byte: ");
        System.out.println("You entered byte: " + b);

        // Leer un int
        int i = ConsoleReader.readInt("Enter an int: ");
        System.out.println("You entered int: " + i);

        // Leer un float
        float f = ConsoleReader.readFloat("Enter a float: ");
        System.out.println("You entered float: " + f);

        // Leer un double
        double d = ConsoleReader.readDouble("Enter a double: ");
        System.out.println("You entered double: " + d);

        // Leer un char
        char c = ConsoleReader.readChar("Enter a single character: ");
        System.out.println("You entered char: " + c);

        // Leer un String entre 5 y 20 caracteres
        String s = ConsoleReader.readString("Enter a string");
        System.out.println("You entered string: " + s);

        // Leer sí/no
        boolean yn = ConsoleReader.readYesNo("Do you want to continue");
        System.out.println("You answered: " + (yn ? "Yes" : "No"));

        sc.close();
    }
}

