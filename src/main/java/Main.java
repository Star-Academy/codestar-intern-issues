import java.io.File;
import java.net.URL;

public class Main {
    public static void main(String[] args) {

        File directoryPath = new File("C:\\Users\\ASUS\\IdeaProjects\\codestar\\src\\main\\resources\\EnglishData");
        //List of all files and directories
        File filesList[] = directoryPath.listFiles();


        try {
            InvertedIndex idx = new InvertedIndex();
            for (int i = 0; i < filesList.length; i++) {
                idx.indexFile(filesList[i]);
            }
            TakeInput takeInput = new TakeInput(idx);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
