package demo_mvc.management_student.exceptions;

public class ExistedStudentExceptions extends Exception {
    public ExistedStudentExceptions() {
        super("The student is available");
    }
}
