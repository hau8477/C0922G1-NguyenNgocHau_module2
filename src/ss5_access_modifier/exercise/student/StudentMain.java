package ss5_access_modifier.exercise.student;

public class StudentMain {
    public static void main(String[] args) {
        Student student1 = new Student();
        Student student2 = new Student();
        student2.setName("NgocHau");
        student2.setClasses("C0922G1");

        System.out.println("Student default: " + student1);
        System.out.println("Student 1: " + student2);
    }
}
