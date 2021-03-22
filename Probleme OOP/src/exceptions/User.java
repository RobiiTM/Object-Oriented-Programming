package exceptions;

public class User {
    private String name;

    public String getName() {
        return name;
    }
    public void setName(String name) throws EmptyNameException, TooLongNameException {
        if (name.length() == 0) {
            EmptyNameException emptyNameException = new EmptyNameException();
            throw emptyNameException;
        }
        if (name.length() > 10) {
            TooLongNameException tooLongNameException = new TooLongNameException();
            throw tooLongNameException;
        }
        this.name = name;
    }
}
