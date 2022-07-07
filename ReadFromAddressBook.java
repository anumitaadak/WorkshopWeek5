import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ReadFromAddressBook {
    public static void main(String[] args) {
        String PATH = "src/file.txt";

        File file = new File(PATH);
        if(file.exists()){
            try {
                Scanner scanner = new Scanner(file);
                System.out.println(scanner);
                while (scanner.hasNextLine()) {
                    System.out.println(scanner.nextLine());
                }
            } catch(FileNotFoundException message) {
                System.out.println(message);
            }
        }
    }
}
