package demo_mvc.management_student.exceptions;

public class InvalidAgeException extends Exception{
    public InvalidAgeException() {
        super("Invalid age");
    }
}
