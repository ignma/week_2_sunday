import java.util.Scanner;

public class StringConcatenation {

    // Function to concatenate two strings
    public static String Concatenate_Strings(String S1, String S2) {
        return S1 + S2;  // Concatenate S1 and S2
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ask the user for the first string
        System.out.print("Enter the first string: ");
        String S1 = scanner.nextLine();

        // Ask the user for the second string
        System.out.print("Enter the second string: ");
        String S2 = scanner.nextLine();

        // Call the function to concatenate the strings
        String result = Concatenate_Strings(S1, S2);

        // Print the concatenated string
        System.out.println("The concatenated string is: " + result);

        scanner.close();
    }
}
