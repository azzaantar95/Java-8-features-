package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class LambdaExample {

    public static void main(String[] args) {
        List<Student> studentList = getStudent();

        printNames(studentList, (student) -> "osama".equalsIgnoreCase(student.getFirstName()));
        printNames(studentList, (student)-> "Ali".equalsIgnoreCase(student.getLastName()));

        printNames(studentList,(student) -> {return student.getScore()>150.0f;});


    }

    public static void printNames(List<Student> list, Predicate<Student> predicate) {

        for (Student student : list) {
            if (predicate.test(student)) {
                System.out.println(student);
            }

        }
    }

    static List<Student> getStudent() {
        List<Student> studentList = new ArrayList<>();
        studentList.add(new Student("Ahmed", "Ali", 150.0f));
        studentList.add(new Student("Mohamed", "Hassan", 160.5f));
        studentList.add(new Student("Ahmed", "Farid", 168.0f));
        studentList.add(new Student("Osama", "Yasser", 130.5f));
        studentList.add(new Student("Mostafa", "Salah", 180.0f));
        studentList.add(new Student("Ameen", "Kareem", 155.5f));
        studentList.add(new Student("Ahmed", "Saad", 139.5f));

        return studentList;

    }
}
