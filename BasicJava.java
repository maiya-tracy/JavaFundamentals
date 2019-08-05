import java.util.ArrayList;
public class BasicJava {
public void oneTo255() {
        for (int i = 1; i <= 255; i++) {
                System.out.println(i);
        }
}
public void oddOneTo255() {
        for (int i = 1; i <= 255; i++) {
                if (i % 2 == 1) {
                        System.out.println(i);
                }
        }
}
public void printSumOneTo255() {
        int sum = 0;
        for (int i = 1; i <= 255; i++) {
                sum += i;
                System.out.println("New number: " + i + "  Sum: " + sum);
        }
}
public void printArray(int[] arr) {
        for (int elem : arr) {
                System.out.println(elem);
        }
}
public void findMax(int[] arr) {
        int max = arr[0];
        for (int elem : arr) {
                if (elem > max) {
                        max = elem;
                }
        }
        System.out.println(max);
}
public void getAverage(int[] arr) {
        int sum = 0;
        for (int elem : arr) {
                sum += elem;
        }
        double avg = sum / arr.length;
        System.out.println(avg);
}
public void createOddArray() {
        ArrayList<Integer> arr = new ArrayList<Integer>();
        for (int i = 1; i <= 255; i++) {
                if (i % 2 == 1) {
                        arr.add(i);
                }
        }
        System.out.println(arr);
}
public void greaterThanY(int[] arr, int Y) {
        int count = 0;
        for (int elem : arr) {
                if (elem > Y) {
                        count++;
                }
        }
        System.out.println(count);
}
public void squareValues(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
                arr[i] = (int) Math.pow(arr[i], 2);
                System.out.println(arr[i]);
        }
}
public void eliminateNegatives(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
                if (arr[i] < 0) {
                        arr[i] = 0;
                }
                System.out.println(arr[i]);
        }
}
public double[] maxMinAvg(int[] arr) {
        int max = arr[0];
        int min = arr[0];
        int sum = 0;
        for (int elem : arr) {
                if (elem > max) {
                        max = elem;
                }
                else if (elem < min) {
                        min = elem;
                }
                sum += elem;
        }
        double avg = sum / arr.length;
        double[] results = {max, min, avg};
        return results;
}
public void shiftValues(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
                if (i == arr.length - 1) {
                        arr[i] = 0;
                }
                else{
                        arr[i] = arr[i+1];
                }
                System.out.println(arr[i]);
        }
}






}
