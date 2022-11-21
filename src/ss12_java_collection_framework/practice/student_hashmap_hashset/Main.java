package ss12_java_collection_framework.practice.student_hashmap_hashset;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        System.out.println("-----------Map-----------");

        Student student1 = new Student("Hậu", 18, "Quảng Nam");
        Student student2 = new Student("Hùng", 27, "Quảng Trị");
        Student student3 = new Student("Đức Vũ", 18, "Đà Nẵng");

        Map<Integer,Student> studentMap = new HashMap<>();
        studentMap.put(1,student1);
        studentMap.put(2,student2);
        studentMap.put(3,student3);
        studentMap.put(4,student1);

        for (Map.Entry<Integer,Student> entry: studentMap.entrySet()) {
            System.out.println(entry.toString());
        }

        System.out.println("-----------Set-----------");

        Set<Student> students = new HashSet<>();
        students.add(student1);
        students.add(student2);
        students.add(student3);
        students.add(student1);

        for (Student student:students) {
            System.out.println(student.toString());
        }
    }
}
