import java.util.Scanner;

public class GreaterNumber {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.print("Type tye first number: ");
        int a = Integer.parseInt(reader.nextLine());
        System.out.print("Type tye second number: ");
        int b = Integer.parseInt(reader.nextLine());
        
        if (a > b) {
            System.out.println("Greater number: " + a);
        } else if (a < b) {
            System.out.println("Greater number: " + b);
        } else {
            System.out.println("The numbers are equal!");
        }
    }
}
