import java.util.Scanner;

public class Reverse_String 
{
    public static void main(String[] args)
  {
       
        Scanner sc = new Scanner(System.in);

      
        System.out.print("Enter a string to reverse: ");
        String input = sc.nextLine();


        String reversed = new StringBuilder(input).reverse().toString();

      
        System.out.println("Reversed string: " + reversed);


        sc.close();
    }
}
