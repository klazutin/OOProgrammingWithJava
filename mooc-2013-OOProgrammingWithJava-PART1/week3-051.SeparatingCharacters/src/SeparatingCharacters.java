
import java.util.Scanner;

public class SeparatingCharacters {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Type your name: ");
        String name = reader.nextLine();
        int i = name.length();
        int ch = 0;
        while (i > 0) {
            System.out.println(ch+1 + ". character: " + name.charAt(ch));
            ch++;
            i--;
        }
               
    }
}
