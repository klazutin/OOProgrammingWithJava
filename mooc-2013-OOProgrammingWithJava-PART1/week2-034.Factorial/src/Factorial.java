import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.print("Type a number: ");
        int last = reader.nextInt();
        int fact = 1;
        int first = 1;
        while (first <= last){
            fact *= first;
            first++;
        }
        System.out.println("Factorial is " + fact);
    }
}
