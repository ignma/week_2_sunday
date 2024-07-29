import java.util.Scanner;

public class OddNumbers {

    // Function to print 2 and all odd numbers between 2 and N
    public static void print_Odd(int N) {
        // Print 2 first
        System.out.println(2);
        
        // Loop through numbers from 3 to N
        for (int i = 3; i <= N; i++) {
            // Check if the number is odd
            if (i % 2 != 0) {
                System.out.println(i);
            }
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ask the user for input
        System.out.print("Enter a number: ");
        int N = scanner.nextInt();

        // Call the function to print odd numbers
        print_Odd(N);

        scanner.close();
    }
}
