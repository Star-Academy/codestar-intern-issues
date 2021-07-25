import java.lang.reflect.Array;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TakeInput {

    public TakeInput(InvertedIndex idx) {
        System.out.println("1");
        getOrder(idx);
    }

    public void getOrder(InvertedIndex idx) {
        System.out.println("2");
        Scanner scanner = new Scanner(System.in);
        while (true) {
            String input = scanner.nextLine();
            String[] inputSplited = input.split("(\\s+)");
            ArrayList<String> plusStrings = new ArrayList<>();
            ArrayList<String> minusStrings = new ArrayList<>();
            ArrayList<String> normalStrings = new ArrayList<>();
            for (String s : inputSplited) {
                Pattern pattern = Pattern.compile("^\\+(.+)$");
                Matcher matcher = pattern.matcher(s);

                Pattern pattern1 = Pattern.compile("^\\-(.+)$");
                Matcher matcher1 = pattern1.matcher(s);

                if (matcher.find()) {
                    String a = matcher.group(1);
                    System.out.println("--1--" + a);
                    plusStrings.add(a);
                 //   System.out.println(plusStrings+"))))");
                }

                else if (matcher1.find()) {
                    String a = matcher1.group(1);
                   System.out.println("--2--" + a);
                    minusStrings.add(a);
                }
                else {
                    System.out.println("--3--" + s);
                    normalStrings.add(s);
                }

            }
            Set<String> answer = idx.search(plusStrings);
            System.out.println("##"+answer);
            Set<String> toDelete = idx.search(minusStrings);


            ArrayList<Set<String>> commons = new ArrayList<>();

            for (String normalString : normalStrings) {
                ArrayList<String> arrayList = new ArrayList<>();
                arrayList.add(normalString);
                commons.add(idx.search(arrayList));
            }
            System.out.println(commons+"***");
            answer = idx.findCommonFiles(answer, commons);
            System.out.println(answer);
            answer = idx.deleteGivenFiles(answer, toDelete);

            for (String s : answer) {
                System.out.println(s);
            }

        }

    }



}
