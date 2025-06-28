/*this code is to help check if an input from a user is a palindrome or not */
import java.util.Scanner;
public class PalindromeTrial {
    public static void main (String [] args){
        //create a Scanner
        Scanner input = new Scanner (System.in);
        
        //prompt users to enter a string (words)
        System.out.print("Enter a strign (word): ");
        String Word = input.nextLine();
        
        // the index of the first character in a string
        int low = 0;
        
        // the index of the last character in a string
        int high = Word.length()-1;
        
        boolean isPalindrome = true;
        while (low < high ){
            if (Word.charAt(low) != Word.charAt(high)){
                isPalindrome = false;
                break;
            }
            low++;
            high--;
        }
        if (isPalindrome)
            System.out.println(Word + " is a palindrome ");
        else
            System.out.println(Word + " is not a palindrome ");
    }
    
}
