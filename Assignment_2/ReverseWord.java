import java.util.Scanner;

public class ReverseWord {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
         System.out.print("Enter a sentence: ");
        String sentence = sc.nextLine();
        
      
        String[] words = sentence.split(" ");
        
       
        StringBuilder reversedSentence = new StringBuilder();
        for (int i = words.length - 1; i >= 0; i--) {
            reversedSentence.append(words[i]).append(" ");
        }
        
       
        System.out.println("Reversed sentence: " + reversedSentence.toString().trim());
        
        sc.close();
    }
}

