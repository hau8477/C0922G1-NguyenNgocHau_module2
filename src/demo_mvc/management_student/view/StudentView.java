package demo_mvc.management_student.view;

import demo_mvc.management_student.controller.StudentController;
import demo_mvc.management_student.exceptions.InvalidAgeException;
import demo_mvc.management_student.model.Student;

import java.util.List;
import java.util.Scanner;

public class StudentView {
    private final StudentController studentController = new StudentController();

    private final Scanner scanner = new Scanner(System.in);

    public void displayMenu() {
        int choice;

        do {
            System.out.println("------------Student Management------------\n" +
                    "1.Display list students.\n" +
                    "2.Add student.\n" +
                    "3.Edit student.\n" +
                    "4.Delete student.\n" +
                    "5.Exit.\n");
            System.out.print("Enter your option: ");
            choice = Integer.parseInt(scanner.nextLine());
            switch (choice) {
                case 1:
                    List<Student> students = this.studentController.displayListStudent();
                    for (Student student:students) {
                        System.out.println(student);
                    }
                    break;
                case 2:
                    System.out.print("Enter id: ");
                    int id = Integer.parseInt(scanner.nextLine());

                    System.out.print("Enter name: ");
                    String name = scanner.nextLine();

                    System.out.print("Enter address: ");
                    String address = scanner.nextLine();

                    Student student = new Student(id,name,address);
                    this.studentController.addStudent(student);
                    break;
                case 3:
                    System.out.print("Enter id you want edit: ");
                    int updateID = Integer.parseInt(scanner.nextLine());

                    System.out.print("Enter new name: ");
                    String newName = scanner.nextLine();

                    System.out.print("Enter new address: ");
                    String newAddress = scanner.nextLine();

                    Student newStudent = new Student(updateID,newName,newAddress);
                    this.studentController.editStudent(newStudent);
                    break;
                case 4:
                    System.out.print("Enter id you want delete: ");
                    int deleteID = Integer.parseInt(scanner.nextLine());
                    this.studentController.deleteStudent(deleteID);
                    break;
                case 5:
                    System.exit(1);
                default:
                    System.out.println("Invalid option");
            }
        } while (true);
    }
}
