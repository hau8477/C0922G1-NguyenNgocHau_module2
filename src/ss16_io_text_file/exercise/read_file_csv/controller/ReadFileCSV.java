package ss16_io_text_file.exercise.read_file_csv.controller;


import ss16_io_text_file.exercise.read_file_csv.model.Country;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class ReadFileCSV {
    public static final String PATH_FILE = "src/ss16_io_text_file/exercise/read_file_csv/data/file.csv";

//    public static List<String> parseCsvLine(String csvLine) {
//        List<String> result = new ArrayList<>();
//
//        if (csvLine != null) {
//            String[] splitData = csvLine.split(",");
//            int lengthSplitData = splitData.length;
//
//            for (int i = 0; i < lengthSplitData; i++) {
//                result.add(splitData[i]);
//            }
//        }
//        return result;
//    }

    public static Country parseCsvLine(String line) {
        String[] splitData = line.split(",");
        int id = Integer.parseInt(splitData[0]);
        String code = splitData[1];
        String name = splitData[2];
        Country countries = new Country(id, code, name);
        return countries;
    }

    public static void printCountry(Country country) {
        System.out.println(country.toString());
    }

    public static void main(String[] args) {
        FileReader fileReader = null;
        BufferedReader bufferedReader = null;

        try {
            fileReader = new FileReader(PATH_FILE);
            bufferedReader = new BufferedReader(fileReader);
            String line = "";
            while ((line = bufferedReader.readLine()) != null) {
                printCountry(parseCsvLine(line));
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
