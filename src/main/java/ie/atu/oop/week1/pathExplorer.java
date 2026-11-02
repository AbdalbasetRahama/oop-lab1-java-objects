package ie.atu.oop.week1;

import java.nio.file.Files;
import java.nio.file.Path;


public class pathExplorer {
    public static void main(String[] args) {
        Path file = Path.of("data", "book.csv");

        System.out.println("path: " + file);
        System.out.println("File: " + file.getFileName());
        System.out.println("Parent: " + file.getParent());
        System.out.println("Absolute path: " + file.toAbsolutePath());
        System.out.println("Exists: " + Files.exists(file));
    }
}
