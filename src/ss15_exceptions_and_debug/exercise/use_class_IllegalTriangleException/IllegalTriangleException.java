package ss15_exceptions_and_debug.exercise.use_class_IllegalTriangleException;

public class IllegalTriangleException extends Exception{

    private String msg;

    public IllegalTriangleException(String msg) {
        this.msg = msg;
    }

    @Override
    public String getMessage() {
        return msg;
    }
}
