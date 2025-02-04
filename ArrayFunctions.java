//ArrayFunctions.java

import java.util.*;

public class ArrayFunctions {
    public void separateEvenOdd(int[] numbers) {
        List<Integer> even = new ArrayList<>();
        List<Integer> odd = new ArrayList<>();

        for (int num : numbers) {
            if (num % 2 == 0) {
                even.add(num);
            } else {
                odd.add(num);
            }
        }

        System.out.println("Even Numbers: " + even);
        System.out.println("Odd Numbers: " + odd);
    }

    public int findSmallestNeighborDistance(int[] numbers) {
        if (numbers.length < 2) return -1;
        int minIndex = 0;
        int minDiff = Math.abs(numbers[1] - numbers[0]);

        for (int i = 1; i < numbers.length - 1; i++) {
            int diff = Math.abs(numbers[i + 1] - numbers[i]);
            if (diff < minDiff) {
                minDiff = diff;
                minIndex = i;
            }
        }
        return minIndex;
    }

    public ArrayList<Integer> arrayToArrayList(int[] array) {
        ArrayList<Integer> list = new ArrayList<>();
        for (int num : array) {
            list.add(num);
        }
        return list;
    }

    public int[] arrayListToArray(ArrayList<Integer> list) {
        int[] array = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            array[i] = list.get(i);
        }
        return array;
    }
}
