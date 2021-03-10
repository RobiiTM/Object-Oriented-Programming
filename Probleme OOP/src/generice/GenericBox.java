package generice;

public class GenericBox<T> {
    private T data;
    public void add(T dataToBeAdded) {
        this.data = dataToBeAdded;
    }

    public T getData() {
        return data;
    }
}
