import java.util.Scanner;

import java.util.Scanner;
public class IntegerPalindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        

        System.out.print("Enter an integer: ");
        int num = sc.nextInt();  // Use a single variable for input
        
        if (isPalindrome(num)) {
            System.out.println(num + " is a palindrome.");
        } else {
            System.out.println(num + " is not a palindrome.");
        }
        
        sc.close();  
    }
    
    public static boolean isPalindrome(int n) {
        int original = n;  
        int reversed = 0; 
        
        
        while (n != 0) {
            reversed = reversed * 10 + n % 10;  
            n /= 10; 
        }
        

        return original == reversed;
    }
}
