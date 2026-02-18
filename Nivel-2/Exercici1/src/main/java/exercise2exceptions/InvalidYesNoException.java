package exercise2exceptions;

public class InvalidYesNoException extends RuntimeException {
    public InvalidYesNoException(String message) {
        super("Input must be 's' or 'n'");
    }
}
