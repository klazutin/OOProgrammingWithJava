import java.util.Scanner;

public class Palindromi {

    public static boolean palindrome(String text) {
        // write code here
        return text.contentEquals(reverse(text));
    }
    
    public static String reverse(String text) {
        String result = "";
        for (int i = text.length(); i>0; i--) {
            result += text.charAt(i-1);
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        
        System.out.println("Type a text: ");
        String text = reader.nextLine();    
        if (palindrome(text)) {
            System.out.println("The text is a palindrome!");
        } else {
            System.out.println("The text is not a palindrome!");
        }
    }
}
