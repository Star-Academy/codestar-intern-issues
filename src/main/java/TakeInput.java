package main.java;

import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TakeInput {

    public TakeInput(InvertedIndex idx) {
        getOrder(idx);
    }

    public void getOrder(InvertedIndex idx) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            String input = scanner.nextLine();
            String[] inputSplited = input.split("(\\s+)");
            if (input.equals("--back"))
                break;
            ArrayList<String> plusStrings = new ArrayList<>();
            ArrayList<String> minusStrings = new ArrayList<>();
            ArrayList<String> normalStrings = new ArrayList<>();
            for (String string : inputSplited)
                addItemToOneOfThreeArrayLists(string, plusStrings, minusStrings, normalStrings);
            showResult(processes(idx, plusStrings, minusStrings, normalStrings));
        }
    }

    private void showResult(Set<String> answer) {
        for (String s : answer) System.out.println(s);

    }

    private Set<String> processes(InvertedIndex idx, ArrayList<String> plusStrings,
                                  ArrayList<String> minusStrings, ArrayList<String> normalStrings) {
        Set<String> answer = idx.search(plusStrings);
        Set<String> toDelete = idx.search(minusStrings);
        ArrayList<Set<String>> commons = new ArrayList<>();
        for (String normalString : normalStrings) {
            ArrayList<String> arrayList = new ArrayList<>();
            arrayList.add(normalString);
            commons.add(idx.search(arrayList));
        }
        answer = idx.findCommonFiles(answer, commons);
        System.out.println(answer);
        answer = idx.deleteGivenFiles(answer, toDelete);
        return answer;
    }

    private void addItemToOneOfThreeArrayLists(String string, ArrayList<String> plusStrings,
                                               ArrayList<String> minusStrings, ArrayList<String> normalStrings) {
        Pattern pattern = Pattern.compile("^\\+(.+)$");
        Matcher matcher = pattern.matcher(string);
        Pattern pattern1 = Pattern.compile("^-(.+)$");
        Matcher matcher1 = pattern1.matcher(string);
        if (matcher.find()) {
            String a = matcher.group(1);
            plusStrings.add(a);
        } else if (matcher1.find()) {
            String a = matcher1.group(1);
            minusStrings.add(a);
        } else normalStrings.add(string);
    }


}
