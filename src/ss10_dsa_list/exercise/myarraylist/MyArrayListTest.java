package ss10_dsa_list.exercise.myarraylist;

public class MyArrayListTest {
    public static void main(String[] args) {
        Student student1 = new Student(1, "Đạt");
        Student student2 = new Student(2, "Nam");
        Student student3 = new Student(3, "Vũ");
        Student student4 = new Student(4, "Hung");
        Student student5 = new Student(5, "Hậu");

        MyArrayList<Student> studentMyArrayList = new MyArrayList<>();
        studentMyArrayList.add(student1);
        studentMyArrayList.add(student2);
        studentMyArrayList.add(student3);
        studentMyArrayList.add(student4);
        studentMyArrayList.add(student5);

        Student student6 = new Student(6, "Ý");
        Student student7 = new Student(7, "Quỳnh");

        studentMyArrayList.add(student6, 3);
        studentMyArrayList.add(student7);
        studentMyArrayList.remove(2);

        for (int i = 0; i < studentMyArrayList.size(); i++) {
            Student student = (Student) studentMyArrayList.elements[i];
            System.out.print(student.getId() + " ");
            System.out.println(student.getName());
        }

        MyArrayList<Student> newArrayList = studentMyArrayList.clone();

        for (int i = 0; i < newArrayList.size(); i++) {
            Student student = (Student) newArrayList.elements[i];
            System.out.print(student.getId() + " ");
            System.out.println(student.getName());
        }

        newArrayList.remove(3);
        System.out.println(newArrayList.contains(student4));
        System.out.println(newArrayList.get(4).getName());
    }
}
