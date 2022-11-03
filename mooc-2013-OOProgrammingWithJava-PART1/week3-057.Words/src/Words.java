import java.util.ArrayList;
import java.util.Scanner;

public class Words {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        ArrayList<String> words = new ArrayList<String>();
        String input = "a";
        while (!input.isEmpty()) {
            System.out.print("Type a word: ");
            input = reader.nextLine();
            words.add(input);
        }
        System.out.println("You typed the following words: ");
        for (String word : words){
            System.out.println(word);
        }
    }
}
