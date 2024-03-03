import java.util.Scanner;

public class convertCaseUsingAscii {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        String convertedString = convertCaseUsingAscii(input);
        System.out.println("Converted string: " + convertedString);

        scanner.close();
    }

    public static String convertCaseUsingAscii(String str) {
        StringBuilder result = new StringBuilder();

        for (char c : str.toCharArray()) {
            if (Character.isUpperCase(c)) {
                result.append((char) (c + 32)); 
            } else if (Character.isLowerCase(c)) {
                result.append((char) (c - 32)); 
            } else {
                result.append(c); 
            }
        }

        return result.toString();
    }
}