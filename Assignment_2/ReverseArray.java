import java.util.Scanner;

class ReverseArray{


   public static void main(String args[]){

      Scanner sc=new Scanner(System.in);
 System.out.print("Enter Size of an element: ");
     int size=sc.nextInt();
 
     int a[]=new int[size];
     System.out.print("Enter an element of an array: ");
     for(int i=0;i<size;i++)
{
     a[i]=sc.nextInt();
    
}

System.out.print("Reverse Array is: ")
System.out.print("[ ");
     for(int i=size-1;i>=0;i--)
{
      System.out.print(a[i]+"  ");

}
System.out.print("]");



}


}