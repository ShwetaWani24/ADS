import java.util.Scanner;

public class ArmstrongNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        int originalNumber = number;
        int result = 0;
        int n = 0;


       while (originalNumber != 0) {
            originalNumber /= 10;
            ++n;
        } 

        originalNumber = number;


        while (originalNumber != 0) {
            int digit = originalNumber % 10;
            result =result+Math.pow(digit, n);
            originalNumber /= 10;
        }


        if (result == number) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }

        scanner.close();
    }
}
