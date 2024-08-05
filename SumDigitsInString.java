import java.util.Scanner;

public class SumDigitsInString {
    public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);
         System.out.print("Enter the String : ");
        String input=scanner.next();
        
        System.out.println("Sum of digits in the string: " + sumDigitsInString(input));
    }

    public static int sumDigitsInString(String input) {
        int sum = 0;

        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);
            if (Character.isDigit(ch)) {
                sum += Character.getNumericValue(ch);
            }
        }

        return sum;
        
    }
    
}
