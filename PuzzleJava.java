import java.util.ArrayList;
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
}
