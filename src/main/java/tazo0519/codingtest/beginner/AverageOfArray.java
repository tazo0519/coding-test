package tazo0519.codingtest.beginner;

import java.util.Arrays;

public class AverageOfArray {

    public static void main(String[] args) {
        int[] numbers = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        double average = Arrays.stream(numbers).average().orElse(0);
        System.out.println(average);
    }
}
