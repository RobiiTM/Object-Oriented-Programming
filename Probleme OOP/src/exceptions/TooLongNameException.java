package exceptions;

public class TooLongNameException extends Exception {
    public TooLongNameException() {
        super("Too long name. Max length is 10 chars!");
    }
}
