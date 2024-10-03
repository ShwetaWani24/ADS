import java.util.Scanner;

public class ReverseNumberUsingString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
       
        System.out.print("Enter a number: ");
        int number = sc.nextInt();
        
       
        String numberStr = Integer.toString(number);
                String reversedStr;
        if (numberStr.charAt(0) == '-') {
            reversedStr = "-" + new StringBuilder(numberStr.substring(1)).reverse().toString();
        } else {
            reversedStr = new StringBuilder(numberStr).reverse().toString();
        }
                int reversedNumber = Integer.parseInt(reversedStr);
        
       
        System.out.println("Reversed number: " + reversedNumber);
        
        sc.close();
    }
}
