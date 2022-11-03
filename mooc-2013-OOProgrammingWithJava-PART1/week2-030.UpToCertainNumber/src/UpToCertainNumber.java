
import java.util.Scanner;


public class UpToCertainNumber {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.print("Up to what number? ");
        Integer end = reader.nextInt();
        Integer num = 1;
        while (num <= end) {
            System.out.println(num);
            num++;
        }
        // Write your code here
        
    }
}
