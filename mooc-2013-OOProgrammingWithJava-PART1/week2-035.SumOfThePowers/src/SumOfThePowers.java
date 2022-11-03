
import java.util.Scanner;

public class SumOfThePowers {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.print("Type a number: ");
        int last = reader.nextInt();
        int first = 0;
        int sum = 0;
        while (first <= last) {
            sum += (int)Math.pow(2, first);
            first++;
        };
        System.out.println("The result is " + sum);
    }
}
