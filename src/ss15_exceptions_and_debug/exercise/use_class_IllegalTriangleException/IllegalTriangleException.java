package ss15_exceptions_and_debug.exercise.use_class_IllegalTriangleException;

public class IllegalTriangleException extends Exception{
    @Override
    public String getMessage() {
        String message = "Triangle edges must be positive numbers\n" +
                "Sum of 2 triangle edges must be bigger than the last triangle edge\n";
        return message;
    }
}
