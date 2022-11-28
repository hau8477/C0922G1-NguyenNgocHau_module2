package ss17_io_binary_file_serialazition.practice.read_and_write_student_to_file_binary.controller;

import ss17_io_binary_file_serialazition.practice.read_and_write_student_to_file_binary.model.Student;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static String PATH_FILE =
            "src/ss17_io_binary_file_serialazition/practice/read_and_write_student_to_file_binary/data/student.txt";

    public static void writeToFile(String path, List<Student> students) {
        FileOutputStream fileOutputStream = null;
        ObjectOutputStream objectOutputStream = null;
        try {
            fileOutputStream = new FileOutputStream(path);
            objectOutputStream = new ObjectOutputStream(fileOutputStream);
            objectOutputStream.writeObject(students);
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            try {
                objectOutputStream.close();
                fileOutputStream.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }

        }
    }

    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student(1, "Vũ Kiều Anh", "Hà Nội"));
        students.add(new Student(2, "Nguyễn Minh Quân", "Hà Nội"));
        students.add(new Student(3, "Đặng Huy Hoà", "Đà Nẵng"));
        students.add(new Student(4, "Nguyễn Khánh Tùng", "Hà Nội"));
        students.add(new Student(5, "Nguyễn Khắc Nhật", "Hà Nội"));
        writeToFile(PATH_FILE, students);
        List<Student> studentDataFromFile = readDataFromFile(PATH_FILE);
        for (Student student : studentDataFromFile) {
            System.out.println(student);
        }
    }

    public static List<Student> readDataFromFile(String path) {
        List<Student> students = new ArrayList<>();
        FileInputStream fileInputStream = null;
        ObjectInputStream objectOutputStream = null;

        try {
            fileInputStream = new FileInputStream(path);
            objectOutputStream = new ObjectInputStream(fileInputStream);

            students = (List<Student>) objectOutputStream.readObject();
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        } finally {
            try {
                objectOutputStream.close();
                fileInputStream.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
        return students;
    }
}
