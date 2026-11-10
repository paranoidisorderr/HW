package homework7;

import java.util.Objects;

public class Student {
    private String name;

    Student(String name) {
        this.name = name;
    }

    @Override
    public int hashCode() {
        return 10;
    }

    @Override
    public boolean equals(Object obj) {
        return true;
    }

}
