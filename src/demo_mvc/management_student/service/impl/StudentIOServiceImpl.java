package demo_mvc.management_student.service.impl;

import demo_mvc.management_student.model.Student;
import demo_mvc.management_student.service.IFileService;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class StudentIOServiceImpl implements IFileService<Student> {
    @Override
    public List<Student> readFile(String path, boolean checkFileNotFound) throws IOException {
        File file = new File(path);

        if (!file.exists()){
            if (checkFileNotFound) {
                throw new FileNotFoundException("Not found student file");
            }
            file.createNewFile();
        }

        FileReader fileReader = new FileReader(file);
        BufferedReader bufferedReader = new BufferedReader(fileReader);

        List<Student> students = new ArrayList<>();
        String line;

        while ((line = bufferedReader.readLine()) != null){
            String[] splitLine = line.split(",");
            Student student = new Student(splitLine);
            students.add(student);
        }

        bufferedReader.close();
        fileReader.close();

        return students;
    }

    @Override
    public void writeFile(String path, List<Student> studentList) throws IOException {
        File file = new File(path);

        if (!file.exists()) {
            file.createNewFile();
        }

        FileWriter fileWriter = new FileWriter(file);
        BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);

        for (Student student:studentList) {
            bufferedWriter.write(student.formatCSVForStudent());
            bufferedWriter.newLine();
        }

        bufferedWriter.close();
        fileWriter.close();
    }
}
