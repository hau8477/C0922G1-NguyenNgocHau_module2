package ss16_io_text_file.exercise.read_file_csv.controller;


import ss16_io_text_file.exercise.read_file_csv.model.Country;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ReadFileCSV {
    public static final String PATH_FILE = "src/ss16_io_text_file/exercise/read_file_csv/data/file.csv";

    public static void parseCsvLine(String line) {
        String[] splitData = line.split(",");
        Country country = new Country(splitData);
        System.out.println(country);
    }

    public static void main(String[] args) {
        FileReader fileReader = null;
        BufferedReader bufferedReader = null;

        try {
            fileReader = new FileReader(PATH_FILE);
            bufferedReader = new BufferedReader(fileReader);
            String line = "";
            while ((line = bufferedReader.readLine()) != null) {
                parseCsvLine(line);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            try {
                bufferedReader.close();
                fileReader.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
