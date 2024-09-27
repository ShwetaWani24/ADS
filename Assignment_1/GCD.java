import java.util.Scanner;

class GCD {

    
    static int gcd(int a, int b) {
        if (b == 0)
            return a;  
        else
            return gcd(b, a % b);  
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        int num1 = sc.nextInt();
        System.out.print("Enter the second number: ");
        int num2 = sc.nextInt();

       
        int result = gcd(num1, num2);
        System.out.println( result);

        sc.close();  
    }
}
