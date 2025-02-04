//UserInput.java

import java.util.Scanner;

public class UserInput {
    public int[] getNumbersFromUser() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of elements: ");
        int n = scanner.nextInt();
        int[] numbers = new int[n];

        System.out.println("Enter the numbers:");
        for (int i = 0; i < n; i++) {
            numbers[i] = scanner.nextInt();
        }
        return numbers;
    }
}

	 