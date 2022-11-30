package demo_mvc.management_student.exceptions;

public class NotFoundStudentExceptions extends Exception{
    public NotFoundStudentExceptions(){
        super("Not found student in database");
    }
}
