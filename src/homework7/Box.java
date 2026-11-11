package homework7;

public class Box<T> {
    private T value;

    public void set(T value) {
        this.value = value;
    }

    public T get() {
        return value;
    }

    public boolean isEmpty(T value) {
        if (value == null) {
            return true;
        }
        return false;
    }

    public String toString(T value) {
        return "box:" + value;
    }
}
