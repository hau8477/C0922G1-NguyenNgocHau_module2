package ss5_access_modifier.exercise.student;

public class StudentMain {
    public static void main(String[] args) {
        Student student1 = new Student();
        System.out.println("Student default: " + student1);
        
        student1.setName("NgocHau");
        student1.setClasses("C0922G1");

        System.out.println("Student 1: " + student1);
    }
}
