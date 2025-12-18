import java.io.IOException;
import java.nio.file.*;
import java.util.stream.Stream;

public class FileOperationDemo {

    public static void main(String[] args) throws IOException {

        Path directoryPath = Paths.get("demoDir");
        Path filePath = Paths.get("demoDir/sample.txt");

//  check file exists
        System.out.println("File Exists ? "+ Files.exists(filePath));

//  Create directory
        if(Files.notExists(directoryPath)) {
            Files.createDirectories(directoryPath);
            System.out.println("Directory created :" + directoryPath);
        }

//  Create Empty File
        if(Files.notExists(filePath)) {
            Files.createFile(filePath);
            System.out.println("Empty File Created :" + filePath);
        }

//  check File Exists Again
        System.out.println("File Exists ? " + Files.exists(filePath));

//  List All Files and Directories
        System.out.println("\nAll Files & Directories :");
        try(Stream<Path> paths = Files.list(directoryPath)){
            paths.forEach(System.out::println);
        }

//  List only Files
        System.out.println("\n Only Files ");
        try(Stream<Path> paths = Files.list(directoryPath)){
            paths.filter(Files::isRegularFile)
                    .forEach(System.out::println);
        }

//  List only Directories
        System.out.println("\n Only Directories");
        try(Stream<Path> paths = Files.list(directoryPath)){
            paths.filter(Files::isDirectory)
                    .forEach(System.out::println);
        }
//  List Files with Extension (.txt)
        System.out.println("\nFiles with .txt extension");
        try(Stream<Path> paths =Files.list(directoryPath)){
            paths.filter(path -> path.toString().endsWith(".txt"))
                    .forEach(System.out::println);
        }

//  Delete File
        Files.deleteIfExists(filePath);
        System.out.println("\nFile deleted.");

//  check File Not Exists
        System.out.println("File exists after deletion ?" + Files.exists(filePath));

    }
}
