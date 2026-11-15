package homework9;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        MyArrayList<Integer> numbers = new MyArrayList<>();

        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        numbers.add(1, 99);

        System.out.println("List:");

        for (int i = 0; i < numbers.size(); i++) {
            System.out.println(numbers.get(i));
        }

        List<Student> students = new ArrayList<>();

        students.add(new Student("Alex", "Group 1", 1, Arrays.asList(4, 5, 4, 3)));
        students.add(new Student("John", "Group 2", 1, Arrays.asList(2, 2, 3, 2)));
        students.add(new Student("Mike", "Group 3", 2, Arrays.asList(5, 4, 5, 5)));

        for (int i = students.size() - 1; i >= 0; i--) {
            if (students.get(i).getAverageGrade() < 3) {
                students.remove(i);
            } else {
                students.get(i).setCourse(students.get(i).getCourse() + 1);
            }
        }

        System.out.println("Students after processing:");

        for (Student student : students) {
            System.out.println(student);
        }

        System.out.println("Students on course 2:");
        printStudents(students, 2);
    }

    public static void printStudents(List<Student> students, int course) {
        for (Student student : students) {
            if (student.getCourse() == course) {
                System.out.println(student.getName());
            }
        }
    }
}