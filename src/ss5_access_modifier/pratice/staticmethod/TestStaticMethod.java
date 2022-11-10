package ss5_access_modifier.pratice.staticmethod;

import ss5_access_modifier.pratice.staticmethod.Student;

public class TestStaticMethod {
    public static void main(String[] args) {
        Student.change();

        Student student1 = new Student(1," Văn Hùng");
        Student student2 = new Student(2," Ngọc Hậu");
        Student student3 = new Student(3," Ngọc Vũ");
        Student student4 = new Student(4," Đức Vũ");

        student1.display();
        student2.display();
        student3.display();
        student4.display();
    }
}
