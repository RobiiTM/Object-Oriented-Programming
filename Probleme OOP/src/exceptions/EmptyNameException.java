package exceptions;

public class EmptyNameException extends Exception{
    public EmptyNameException() {
        super("Empty name!");
    }
}
