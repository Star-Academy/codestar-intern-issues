
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class InvertedIndex {
    List<String> stopwords = Arrays.asList("a", "able", "about",
            "across", "after", "all", "almost", "also", "am", "among", "an",
            "and", "any", "are", "as", "at", "be", "because", "been", "but",
            "by", "can", "cannot", "could", "dear", "did", "do", "does",
            "either", "else", "ever", "every", "for", "from", "get", "got",
            "had", "has", "have", "he", "her", "hers", "him", "his", "how",
            "however", "i", "if", "in", "into", "is", "it", "its", "just",
            "least", "let", "like", "likely", "may", "me", "might", "most",
            "must", "my", "neither", "no", "nor", "not", "of", "off", "often",
            "on", "only", "or", "other", "our", "own", "rather", "said", "say",
            "says", "she", "should", "since", "so", "some", "than", "that",
            "the", "their", "them", "then", "there", "these", "they", "this",
            "tis", "to", "too", "twas", "us", "wants", "was", "we", "were",
            "what", "when", "where", "which", "while", "who", "whom", "why",
            "will", "with", "would", "yet", "you", "your");

    Map<String, List<Tuple>> indexedWords = new HashMap<String, List<Tuple>>();
    List<String> files = new ArrayList<String>();

    public void indexFile(File file) throws IOException {
        int fileNumber = files.indexOf(file.getPath());
        if (fileNumber == -1) {
            files.add(file.getPath());
            fileNumber = files.size() - 1;
        }

        int position = 0;
        BufferedReader reader = new BufferedReader(new FileReader(file));
        for (String line = reader.readLine(); line != null; line = reader
                .readLine()) {
            for (String _word : line.split("\\W+")) {
                String word = _word.toLowerCase();
                position++;
                if (stopwords.contains(word))
                    continue;
                List<Tuple> idx = indexedWords.get(word);
                if (idx == null) {
                    idx = new LinkedList<Tuple>();
                    indexedWords.put(word, idx);
                }
                idx.add(new Tuple(fileNumber, position));
            }
        }
        //  System.out.println("indexed " + file.getPath() + " " + position + " words");
    }

    public Set<String> search(ArrayList<String> wordsToFind) {
       // System.out.println("%%%%");
        // System.out.println(wordsToFind);
        Set<String> answer = new HashSet<String>();
        for (String words : wordsToFind) {

            String word = words.toLowerCase();
            for (String key : indexedWords.keySet()) {
                Matcher matcher = Pattern.compile(word).matcher(key);
                if (matcher.find()) {
                    List<Tuple> tupleList = indexedWords.get(key);
                    if (tupleList != null) {
                        for (Tuple t : tupleList) {
                            answer.add(files.get(t.fileNumber));
                        }
                    }
//                    System.out.print(word);
//                    for (String f : answer) {
//                        System.out.print(" " + f);
//                    }
//                    System.out.println("");
                }
            }
        }
     //   System.out.println(answer + "^^^");
        return answer;
    }

    public Set<String> findCommonFiles(Set<String> answer, ArrayList<Set<String>> wordsToFindCommon) {
        Set<String> commonWords = findCommonWords(wordsToFindCommon);
        if (answer.size() >0  && commonWords != null) {
            answer.retainAll(commonWords);
            return answer;
        }
        else if (answer.size() == 0 && commonWords != null) {
            return commonWords;
        }
        else if (answer.size() == 0 && commonWords == null) {
            return null;
        }else return answer;

    }

    public Set<String> deleteGivenFiles(Set<String> answer, Set<String> deleteFiles) {
       for (String s : deleteFiles){
           answer.remove(s);
       }
        return answer;
    }


    public Set<String> findCommonWords(ArrayList<Set<String>> wordsToFindCommon) {
        if (wordsToFindCommon.size() > 0) {
            Set<String> commonWords = wordsToFindCommon.get(0);

            if (wordsToFindCommon.size() > 1) {
                for (int i = 1; i < wordsToFindCommon.size(); i++) {
                    commonWords.retainAll(wordsToFindCommon.get(i));
                }
            }
            return commonWords;
        }
        return null;
    }


//    public static void main(String[] args) {
//        try {
//            InvertedIndex idx = new InvertedIndex();
//            File file = new File("C:\\Users\\ASUS\\IdeaProjects\\codestar\\src\\main\\resources\\test.txt");
//
//            BufferedReader br = new BufferedReader(new FileReader(file));
//            String st;
////            while ((st = br.readLine()) != null)
////                System.out.println(st);
//            idx.indexFile(file);
//            idx.indexFile(new File("C:\\Users\\ASUS\\IdeaProjects\\codestar\\src\\main\\resources\\test2.txt"));
//            ArrayList<String> asd = new ArrayList<>();
//            asd.add("ali");
//            asd.add("hassan");
//            System.out.println("!!!" + idx.search(asd));
//            //findCommonFiles
//            ArrayList<String> test = new ArrayList<>();
//            test.add("asdqwe");
//            ArrayList<Set<String>> common = new ArrayList<>();
//            common.add(idx.search(test));
//            System.out.println("###" + idx.findCommonFiles(idx.search(asd), common));
//            System.out.println();
//        } catch (Exception e) {
//        }
//
//
//    }


    private class Tuple {
        private int fileNumber;
        private int position;

        public Tuple(int fileno, int position) {
            this.fileNumber = fileno;
            this.position = position;
        }

        public int getPosition() {
            return position;
        }
    }
}
 