package demo_mvc.management_student.service;

import demo_mvc.management_student.exceptions.ExistedStudentExceptions;
import demo_mvc.management_student.exceptions.NotFoundStudentExceptions;
import demo_mvc.management_student.model.Student;

import java.io.IOException;
import java.util.List;

public interface IStudentService {
    List<Student> displayListStudent() throws IOException;

    void addStudent(Student student) throws IOException, ExistedStudentExceptions;

   void editStudent(Student student) throws IOException;

   void deleteStudent(int id) throws IOException, NotFoundStudentExceptions;


}
