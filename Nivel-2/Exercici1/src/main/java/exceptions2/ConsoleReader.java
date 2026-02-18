package exceptions2;

import exercise2exceptions.InvalidCharException;
import exercise2exceptions.InvalidYesNoException;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ConsoleReader {
    private static Scanner sc = new Scanner(System.in);

    public static byte readByte(String message) {
        byte value = 0;
        boolean isValid = false;

        while (!isValid) {
            System.out.print(message);
            try {
                value = sc.nextByte();
                isValid = true;
            } catch (InputMismatchException e) {
                System.out.println("The number must be between -128 and 127. Try again!");
                sc.nextLine();
            }
        }
        return value;
    }

    public static int readInt(String message) {
        int number = 0;
        boolean isValid = false;

        while (!isValid) {
            System.out.print(message);
            try {
                number = sc.nextInt();
                isValid = true;
            } catch (InputMismatchException e) {
                System.out.println("The number is not a valid int. Try again!");
                sc.nextLine();
            }
        }
        return number;
    }

    public static float readFloat(String message) {
        float number = 0;
        boolean isValid = false;

        while (!isValid) {
            System.out.print(message);
            try {
                number = sc.nextFloat();
                isValid = true;
            } catch (InputMismatchException e) {
                System.out.println("The number is not a valid float. Try again!");
                sc.nextLine();
            }
        }
        return number;
    }

    public static double readDouble(String message) {
        double number = 0.0;
        boolean isValid = false;

        while (!isValid) {
            System.out.print(message);
            try {
                number = sc.nextDouble();
                sc.nextLine();
                isValid = true;
            } catch (InputMismatchException e) {
                System.out.println("This isn't a valid double number. Try again!");
                sc.nextLine();
            }
        }
        return number;
    }

    public static char readChar(String message) {
        while (true) {
            System.out.print(message);
            String letter = sc.nextLine();
            if (letter.length() == 1) {
                return letter.charAt(0);
            }
            System.out.println("This value isn't a char. Try again!");
        }
    }

    public static String readString(String message) {
        String chain = "";
        boolean isValid = false;

        while (!isValid) {
            System.out.print(message + " (More or equal to 10 Characters: ");
            try {
                chain = sc.nextLine();
                if (chain.length() >= 10) {
                    isValid = true;
                } else {
                    throw new IllegalArgumentException("The string must be between 5 and 20 characters long.");
                }
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
            }
        }
        return chain;
    }

    public static boolean readYesNo(String message) {
        String response = "";

        while (true) {
            System.out.print(message + " (s/n): ");
            try {
                response = sc.nextLine();
                if (response.equalsIgnoreCase("s")) {
                    return true;
                } else if (response.equalsIgnoreCase("n")) {
                    return false;
                } else {
                    throw new InvalidYesNoException("The response only can be 's' or 'n'. Try again!");
                }
            } catch (InvalidYesNoException e) {
                System.out.println(e.getMessage());
            }
        }
    }
}
