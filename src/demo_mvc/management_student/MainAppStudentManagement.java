package demo_mvc.management_student;

import demo_mvc.management_student.view.StudentView;

public class MainAppStudentManagement {
    public static void main(String[] args) {
        StudentView studentView = new StudentView();
        studentView.displayMenu();
    }
}
