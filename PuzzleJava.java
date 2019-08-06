import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class PuzzleJava {

public ArrayList<Integer> sumAndGreaterThan10(Integer[] arr) {
        Integer sum = 0;
        ArrayList<Integer> results = new ArrayList<Integer>();
        for (Integer elem : arr) {
                sum += elem;
                if (elem > 10) {
                        results.add(elem);
                }
        }
        System.out.println(sum);
        return results;
}
public ArrayList<String> shuffleAndReturnNames(ArrayList<String> names) {
        names.add("Nancy");
        names.add("Jinichi");
        names.add("Fujibayashi");
        names.add("Momo");
        names.add("Ishi");
        Collections.shuffle(names);
        System.out.println(names);
        names.removeIf(name->(name.length() <= 5));
        return names;
}
public void shuffleAndReturnAlpha(String[] letters) {
        ArrayList<String> letterArray = new ArrayList<String>();
        for (int i=0; i< letters.length; i++) {
                letterArray.add(letters[i]);
        }

        Collections.shuffle(letterArray);
        System.out.println(letterArray.get(25));
        System.out.println(letterArray.get(0));
        System.out.println(letterArray);
        String vowels = "AEIOU";
        if (vowels.contains(letterArray.get(0))) {
                System.out.println("first letter is a vowel");
        }
}
public ArrayList<Integer> generateRandomNumbers(Integer low, Integer high, Integer quantity) {
        Random r = new Random();
        ArrayList<Integer> results = new ArrayList<Integer>();
        for (int i=0; i < quantity; i++) {
                results.add(r.nextInt(high-low) + low);
        }
        return results;
}
public void showMinMax(ArrayList<Integer> results) {
        System.out.println("Min: " + results.get(0) + " Max: " + results.get(results.size() - 1 ));
}
public String randomString(int length) {
        StringBuilder s = new StringBuilder();
        Random r = new Random();
        while (s.length() < 5 ) {
                char c = (char) (r.nextInt(26) + 'a');
                s.append(c);
        }
        return s.toString();
}
public ArrayList<String> arrayOfStrings(int length, int quantity) {
        ArrayList<String> results = new ArrayList<String>();
        for (int i=0; i < quantity; i++) {
                results.add(randomString(length));
        }
        return results;
}









}
