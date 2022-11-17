package ss10_dsa_list.exercise.mylinkedlist;

import java.util.LinkedList;

public class MyLinkedListTest {
    public static void main(String[] args) {
        MyLinkedList<Student> myLinkedList = new MyLinkedList<>();
        Student student1 = new Student(1, "Hậu");
        Student student2 = new Student(2, "Hùng");
        Student student3 = new Student(3, "Vũ");
        Student student4 = new Student(4, "Đạt");

        myLinkedList.addFirst(student1);
        myLinkedList.addFirst(student2);
        myLinkedList.addLast(student3);
        myLinkedList.addLast(student4);

        for (int i = 0; i < myLinkedList.size(); i++) {
            Student student = (Student) myLinkedList.get(i);
            System.out.println(student.getName());
        }

        myLinkedList.remove(student1);

        for (int i = 0; i < myLinkedList.size(); i++) {
            Student student = (Student) myLinkedList.get(i);
            System.out.println(student.getName());
        }

        MyLinkedList<Student> cloneLinkedList = myLinkedList.clone();

        for (int i = 0; i < cloneLinkedList.size(); i++) {
            Student student = (Student) cloneLinkedList.get(i);
            System.out.println(student.getName());
        }

        System.out.println(myLinkedList.constrain(student2));
        System.out.println(myLinkedList.indexOf(student3));

    }
}
