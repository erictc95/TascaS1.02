public class EmptySaleException extends RuntimeException {
    public EmptySaleException() {
        super("To do a sale, needs products first");
    }
}
