package main.java;

import java.io.File;

public class Main {
    public static void main(String[] args) {
        preprocesses();
    }

    public static void preprocesses() {
        File directoryPath = new File("C:\\Users\\ASUS\\IdeaProjects\\codestar\\src\\main\\resources\\EnglishData");
        File[] filesList = directoryPath.listFiles();
        try {
            InvertedIndex idx = new InvertedIndex();
            assert filesList != null;
            for (File file : filesList) {
                idx.indexFile(file);
            }
            new TakeInput(idx);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
