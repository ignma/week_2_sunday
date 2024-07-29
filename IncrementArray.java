import java.util.Scanner;

public class IncrementArray {

    // Function to increment each element of the array by 1
    public static void incrementArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            array[i] += 1;  // Increment each element by 1
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ask the user for input
        System.out.print("Enter the number of elements in the array: ");
        int n = scanner.nextInt();

        int[] array = new int[n];

        // Read the array elements from the user
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            array[i] = scanner.nextInt();
        }

        // Increment each element of the array
        incrementArray(array);

        // Print the updated array
        System.out.println("The incremented array is:");
        for (int num : array) {
            System.out.print(num + " ");
        }

        scanner.close();
    }
}
