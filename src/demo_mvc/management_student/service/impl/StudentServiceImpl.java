package demo_mvc.management_student.service.impl;

import demo_mvc.management_student.exceptions.ExistedStudentExceptions;
import demo_mvc.management_student.exceptions.NotFoundStudentExceptions;
import demo_mvc.management_student.model.Student;
import demo_mvc.management_student.service.IStudentService;

import java.io.IOException;
import java.util.List;

public class StudentServiceImpl implements IStudentService {
    private static final String PATH_FILE = "src/demo_mvc/management_student/data/student_file.csv";

    private final StudentIOServiceImpl studentIOService = new StudentIOServiceImpl();
    @Override
    public List<Student> displayListStudent() throws IOException{
        return this.studentIOService.readFile(PATH_FILE,true);
    }

    @Override
    public void addStudent(Student student) throws ExistedStudentExceptions, IOException {
        List<Student> students = this.studentIOService.readFile(PATH_FILE,false);

        for (Student st:students) {
            if (st.getId() == student.getId()) {
                throw new ExistedStudentExceptions();
            }
        }
        students.add(student);
        this.studentIOService.writeFile(PATH_FILE,students);
    }

    @Override
    public void editStudent(Student student) throws IOException {
        List<Student> students = this.studentIOService.readFile(PATH_FILE,false);

        for (Student st:students) {
            if (st.getId() == student.getId()) {
                st.setName(student.getName());
                st.setAddress(student.getAddress());
                break;
            }
        }
        this.studentIOService.writeFile(PATH_FILE,students);
    }

    @Override
    public void deleteStudent(int id) throws IOException, NotFoundStudentExceptions {
        List<Student> students = this.studentIOService.readFile(PATH_FILE,false);
        Student studentDelete = null;

        for (Student st:students) {
            if (st.getId() == id) {
                studentDelete = st;
                break;
            }
        }
        if (studentDelete == null) {
            throw new NotFoundStudentExceptions();
        }
        students.remove(studentDelete);
        this.studentIOService.writeFile(PATH_FILE,students);
    }
}
