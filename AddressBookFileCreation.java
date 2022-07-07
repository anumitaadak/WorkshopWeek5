
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;


public class AddressBookFileCreation {
    public static void main(String[] args) {
        String PATH = "src/file.txt";

        try{
            File file = new File(PATH);
            if(file.exists()){
                FileWriter fileWriter = new FileWriter(PATH,true);
                fileWriter.write("\n name : Rishi,Contact no : 975645353");
                fileWriter.write("\n name : Rakhi,Contact no : 90886756");
                fileWriter.write("\n name : Aasha,Contact no : 9877664534");
                fileWriter.write("\nname : Siya,Contact no : 987675655");
                fileWriter.flush();
            } else {
                System.out.println("File not available");
            }
        } catch (IOException message){
            System.out.println(message);
        }

        
    }

}
