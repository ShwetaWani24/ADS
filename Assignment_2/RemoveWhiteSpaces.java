import java.util.Scanner;

public class RemoveWhiteSpaces {

    static String removeWhiteSpaces(String input) {
        return input.replaceAll("\\s+", "");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter a string:");
        String input = sc.nextLine();
        
        String result = removeWhiteSpaces(input);
        System.out.println( result);
    }
}
