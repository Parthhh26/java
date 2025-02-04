//Main.java
/**
 * Name: Parnika Jain
 * PRN: 23070126087
 * Batch: B1
 */



import java.util.*;

public class Main {
    public static void main(String[] args) {
        // Create an instance of UserInput to get numbers from the user
        UserInput userInput = new UserInput();
        int[] numbers = userInput.getNumbersFromUser();

        // Create an instance of ArrayFunctions to perform operations
        ArrayFunctions arrayFunctions = new ArrayFunctions();
        
        // Separate even and odd numbers
        arrayFunctions.separateEvenOdd(numbers);

        // Find the index of the first number in the smallest neighbor pair
        int index = arrayFunctions.findSmallestNeighborDistance(numbers);
        System.out.println("Index of first number in the smallest pair: " + index);

        // Convert array to ArrayList
        ArrayList<Integer> arrayList = arrayFunctions.arrayToArrayList(numbers);
        System.out.println("ArrayList: " + arrayList);

        // Convert ArrayList back to array
        int[] convertedArray = arrayFunctions.arrayListToArray(arrayList);
        System.out.println("Converted Array: " + Arrays.toString(convertedArray));
    }
}
