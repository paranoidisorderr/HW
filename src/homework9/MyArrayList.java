package homework9;

import java.util.Collection;
import java.util.Objects;

public class MyArrayList<T> implements MyList<T> {
    private Object[] elements;
    private int size;

    MyArrayList() {
        elements = new Object[10];
        size = 0;
    }

    MyArrayList(int capacity) {
        elements = new Object[capacity];
        size = 0;
    }

    public MyArrayList(MyList<? extends T> col) {
        elements = new Object[col.size()];
        size = 0;

        for (int i = 0; i < col.size(); i++) {
            add(col.get(i));
        }
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public boolean isEmpty() {
        if (size == 0) {
            return true;
        }
        return false;
    }

    @Override
    public boolean contains(Object value) {
        for (Object i : elements) {
            if (i.equals(value)) {
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean add(T value) {
        ensureCapacity(size);
        elements[size] = value;
        size++;
        return true;
    }

    @Override
    public boolean add(int index, T value) {
    ensureCapacity(size);
    for (int i = size; i > index; i--) {
        elements[i] = elements[i - 1];
    }
    elements[index] = value;
    size++;
    return true;
    }

    @Override
    public boolean remove(Object value) {
        for (int i = 0; i < size; i++) {
            if (elements[i] == value) {
                for (int j = i; j < size - 1; j++) {
                    elements[j] = elements[j + 1];
                }
                size--;
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean addAll(Collection<? extends T> value) {
        ensureCapacity(size + value.size());
        for (T element : value) {
            elements[size] = element;
            size++;
        }
        return true;
    }

    @Override
    public T get(int index) {
        return (T) elements[index];
    }

    @Override
    public T remove(int index) {
        T removedElement = (T) elements[index];

        for (int i = index; i < size - 1; i++) {
            elements[i] = elements[i + 1];
        }
        size--;
        return removedElement;
    }

    @Override
    public T set(int index, T value) {
        T newValue = (T) elements[index];
        elements[index] = value;
        return newValue;
    }

    @Override
    public int indexOf(Object value) {
        for (int i = 0; i < size; i++) {
            if (elements[i].equals(value)) {
                return i;
            }
        }
        return 0;
    }

    void ensureCapacity(int size) {
        if (size > elements.length) {
        Object[] newArr = new Object[size * 2];

        for (int i = 0; i > elements.length; i++) {
            newArr[i] = elements[i];
        }
        elements = newArr;
        }

    }
}