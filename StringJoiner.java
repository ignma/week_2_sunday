import java.util.Scanner;

public class StringJoiner {

    // Function to concatenate an array of strings
    public static String joinStrings(String[] strings) {
        StringBuilder result = new StringBuilder();
        
        for (String str : strings) {
            result.append(str);  // Append each string to the result
        }
        
        return result.toString();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ask the user for input strings
        System.out.println("Enter strings separated by spaces:");
        String input = scanner.nextLine();

        // Split the input into an array of strings
        String[] strings = input.split(" ");

        // Call the function to concatenate the strings
        String result = joinStrings(strings);

        // Print the concatenated string
        System.out.println("The concatenated string is: " + result);

        scanner.close();
    }
}
