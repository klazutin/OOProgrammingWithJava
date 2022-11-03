
import java.util.Scanner;

public class SumOfTheAges {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.print("Type your name: ");
        String aName = reader.nextLine();
        System.out.print("Type your age: ");
        int a = Integer.parseInt(reader.nextLine());
        System.out.print("Type your name: ");
        String bName = reader.nextLine();
        System.out.print("Type your age: ");
        int b = Integer.parseInt(reader.nextLine());
        System.out.println(aName + " and " + bName + " are " + (a+b) + " years old in total.");
        // Implement your program here
    }
}
