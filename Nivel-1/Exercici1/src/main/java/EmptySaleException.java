public class EmptySaleException extends Exception {
    public EmptySaleException() {
        super("To do a sale, needs products first");
    }
}
