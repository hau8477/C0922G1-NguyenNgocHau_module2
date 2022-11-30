package demo_mvc.management_student.controller;

import demo_mvc.management_student.exceptions.ExistedStudentExceptions;
import demo_mvc.management_student.exceptions.NotFoundStudentExceptions;
import demo_mvc.management_student.model.Student;
import demo_mvc.management_student.service.IStudentService;
import demo_mvc.management_student.service.impl.StudentServiceImpl;

import java.io.IOException;
import java.util.List;

public class StudentController {
    private final IStudentService studentService = new StudentServiceImpl();

    public List<Student> displayListStudent(){
        try {
            return this.studentService.displayListStudent();
        } catch (IOException e) {
            System.err.println(e.getMessage());
            return null;
        }
    }

    public void addStudent(Student student){
        try {
            this.studentService.addStudent(student);
        } catch (IOException | ExistedStudentExceptions e) {
            System.err.println(e.getMessage());
        }
    }

    public void editStudent(Student student){
        try {
            this.studentService.editStudent(student);
        } catch (IOException e) {
            System.err.println(e.getMessage());
        }
    }

    public void deleteStudent(int id){
        try {
            this.studentService.deleteStudent(id);
        } catch (IOException | NotFoundStudentExceptions e) {
            System.err.println(e.getMessage());
        }
    }
}
