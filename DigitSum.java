import java.util.Scanner;

public class DigitSum {

    // Function to calculate the sum of digits of a number
    public static int sumOfDigits(int number) {
        int sum = 0;
        
        // Loop to process each digit
        while (number != 0) {
            // Add the last digit to sum
            sum += number % 10;
            // Remove the last digit from the number
            number /= 10;
        }
        
        return sum;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ask the user for input
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        // Call the function to calculate the sum of digits
        int result = sumOfDigits(number);

        // Print the result
        System.out.println("The sum of the digits is: " + result);

        scanner.close();
    }
}
