package exercise2exceptions;

public class InvalidCharException extends RuntimeException {
    public InvalidCharException(String message) {
        super("There are more tha a 1 Character");
    }
}
