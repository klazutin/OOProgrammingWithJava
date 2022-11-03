
import java.util.Scanner;

public class Circumference {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.print("Type the radius: ");
        double r = Integer.parseInt(reader.nextLine());
        double c = r * Math.PI * 2;
        System.out.println("Circumference of the circle: " + c);
        // Program your solution here 
    }
}
