package ss12_java_collection_framework.practice.comparable_comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Student student1 = new Student("Hậu", 18, "Quảng Nam");
        Student student2 = new Student("Hùng", 27, "Quảng Trị");
        Student student3 = new Student("Ngọc Vũ", 27, "Quảng Nam");
        Student student4 = new Student("Đức Vũ", 31, "Đà Nẵng");

        List<Student> studentList = new ArrayList<>();
        studentList.add(student1);
        studentList.add(student2);
        studentList.add(student3);
        studentList.add(student4);

        System.out.println("Before: ");
        for (Student student: studentList) {
            System.out.println(student.toString());
        }

        Collections.sort(studentList);

        System.out.println("After reverse by name: ");
        for (Student student: studentList) {
            System.out.println(student.toString());
        }

        AgeComparator ageComparator = new AgeComparator();
        studentList.sort(ageComparator);
        System.out.println("After reverse by age: ");
        for (Student student: studentList) {
            System.out.println(student.toString());
        }
    }
}
