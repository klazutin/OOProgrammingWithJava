
import java.util.Random;
import java.util.Scanner;

public class GuessingNumberGame {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int numberDrawn = drawNumber();
        int attempt = 0;
        while (true){
            System.out.print("Guess a number: ");
            int guess = Integer.parseInt(reader.nextLine());        
            if (guess < numberDrawn){
                attempt++;
                System.out.println("The number is greater, guesses made: " + attempt);
            } else if (guess > numberDrawn) {
                attempt++;
                System.out.println("The number is lesser, guesses made: " + attempt);
            } else {
                System.out.println("Congratulations, your guess is correct!");
                break;
            }
        }

        // program your solution here. Do not touch the above lines!
        
    }

    // DO NOT MODIFY THIS!
    private static int drawNumber() {
        return new Random().nextInt(101);
    }
}
