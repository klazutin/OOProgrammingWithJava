
import java.util.Scanner;

public class LowerLimitAndUpperLimit {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.print("First: ");
        Integer first = reader.nextInt();
        System.out.print("Last: ");
        Integer last = reader.nextInt();
        while (first <= last) {
            System.out.println(first);
            first++;
        }
        // write your code here

    }
}
