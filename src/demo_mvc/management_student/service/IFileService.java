package demo_mvc.management_student.service;

import java.io.IOException;
import java.util.List;

public interface IFileService<O> {

    List<O> readFile(String path, boolean checkFileNotFound) throws IOException, ClassNotFoundException;

    void writeFile(String path, List<O> list) throws IOException;
}
