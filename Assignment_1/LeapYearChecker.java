import java.util.Scanner;

public class LeapYearChecker {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        
        System.out.print("Enter a year: ");
        int year = sc.nextInt();
        
        
        boolean isLeap = isLeapYear(year);
        
       
        System.out.println( isLeap);
        
        sc.close();  
    }
    
    public static boolean isLeapYear(int year) {
       
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }
}
