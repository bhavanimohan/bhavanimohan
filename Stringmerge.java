import java.util.Scanner;

public class Stringmerge{  // Class name should be capitalized
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the first name: ");
        String a = scanner.nextLine();

        System.out.println("Enter the second name: ");
        String b = scanner.nextLine();

        // Get the length of the longer string
        int maxLength = Math.max(a.length(), b.length());

        // Loop through both strings, alternating characters
        for (int i = 0; i < maxLength; i++) {
            if (i < a.length()) {
                System.out.print(a.charAt(i));  // Print character from 'a' without newline
            }
            if (i < b.length()) {
                System.out.print(b.charAt(i));  // Print character from 'b' without newline
            }
        }

        scanner.close();  // Close scanner to prevent resource leaks

        // Optional: Print a newline at the end if needed
        System.out.println();  // This just moves the cursor to the next line after output
    }
}
