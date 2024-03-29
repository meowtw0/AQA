package org.example;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ReaderFile {
    public static void main(String[] args) {
        try {
            processFile("/Users/evan/Downloads/Major_Arcana.txt");
        } catch (FileProcessingException e) {
            System.err.println("Exception: " + e.getMessage());
        }
    }
    static void processFile(String filename) throws FileProcessingException {
        try {
            readFile(filename);
        } catch (IOException e) {
            throw new FileProcessingException("Помилка читання файлу", e);
        } catch (RuntimeException e) {
            System.err.println("Unchecked Exception caught: " + e.getMessage());
        }
    }
    static void readFile(String filename) throws IOException {
        try (BufferedReader reader = new BufferedReader(new FileReader(filename))) {
            String line = reader.readLine();
        }
    }
    static class FileProcessingException extends Exception {
        public FileProcessingException(String message, Throwable cause) {
            super(message, cause);
        }
    }
}
