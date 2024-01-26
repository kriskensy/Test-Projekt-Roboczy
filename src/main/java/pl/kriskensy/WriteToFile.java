package pl.kriskensy;

import java.io.*;

public class WriteToFile {
    private static final String FILE_PATH = "C:/_temp/plikTestowy.txt";

    public static void writeToFile(Vehicle vehicle) {
        try {
            FileWriter fileWriter = new FileWriter(FILE_PATH,true);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            vehicle.printInformation();
            bufferedWriter.newLine();
            bufferedWriter.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}