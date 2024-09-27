import java.util.Scanner;

class SquareRoot {

    static int squareRoot(int n) {
        if (n == 0 || n == 1) {
            return n;  
        }

        int start = 1, end = n, result = 0;
        while (start <= end) {
            int mid = (start + end) / 2;

           
            if (mid * mid == n) {
                return mid;
            }

            
            if (mid * mid < n) {
                start = mid + 1;
                result = mid; 
            }
            
            else {
                end = mid - 1;
            }
        }

        return result; 
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int x = sc.nextInt();
        
        
        int result = squareRoot(x);
        System.out.println( result);
        
        sc.close();  
    }
}
