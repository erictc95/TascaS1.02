import java.util.Scanner;

public class ConsoleReader {
    private static Scanner sc = new Scanner(System.in);

    public static byte readByte(String message) {
        System.out.println(message);
        Byte value = sc.nextByte();
        return value;
    }

    public static int readInt(String message) {
        System.out.println(message);
        int value = sc.nextInt();
        return value;
    }

    public static float readFloat(String message) {
        System.out.println(message);
        float value = sc.nextFloat();
        return value;
    }

    public static double readDouble(String message) {
        System.out.println(message);
        double value = sc.nextInt();
        return value;
    }

    public static char readChar(String message) {
        System.out.println(message);
        String letter = sc.nextLine();
        if (letter.length() == 1) {
            return letter.charAt(0);
        } else {
            throw new InvalidCharException(message);
        }
    }



}
