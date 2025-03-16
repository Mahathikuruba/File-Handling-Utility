import java.util.Scanner;

public class FileOperations {

    // Simulate a file using a String
    private static String fileContent = "";

    /**
     * Simulates reading a file by printing the content.
     */
    public static void readFile() {
        System.out.println("File Content:");
        System.out.println(fileContent);
    }

    /**
     * Simulates writing to a file by updating the content.
     *
     * @param content The content to write.
     */
    public static void writeFile(String content) {
        fileContent = content;
        System.out.println("Content written to file.");
    }

    /**
     * Simulates modifying a file by appending new content.
     *
     * @param newContent The content to append.
     */
    public static void modifyFile(String newContent) {
        fileContent += "\n" + newContent;
        System.out.println("Content appended to file.");
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Write to file
        System.out.println("Enter content to write to the file:");
        String content = scanner.nextLine();
        writeFile(content);

        // Read from file
        System.out.println("\nReading the file after writing:");
        readFile();

        // Modify file
        System.out.println("\nEnter additional content to append to the file:");
        String newContent = scanner.nextLine();
        modifyFile(newContent);

        // Read from file after modification
        System.out.println("\nReading the file after modification:");
        readFile();

        scanner.close();
    }
}
