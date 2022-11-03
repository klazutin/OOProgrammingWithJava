import java.util.Scanner;

public class LoopsEndingRemembering {
    public static void main(String[] args) {
        // program in this project exercises 36.1-36.5
        // actually this is just one program that is split in many parts
        
        Scanner reader = new Scanner(System.in);
        int num = 0;
        int sum = 0;
        int count = 0;
        int countEven = 0;
        int countOdd = 0;
        System.out.println("Type numbers: ");        
        while (num != -1) {
            num = reader.nextInt();            
            if (num != -1) {
                sum += num;
                count++;    
                if (num % 2 == 0) {
                    countEven++;
                } else {
                    countOdd++;
                }
            }
        };
        System.out.println("Thank you and see you later!");
        System.out.println("The sum is " + sum);
        System.out.println("How many numbers: " + count);
        System.out.println("Average: " + (double)sum/count);
        System.out.println("Even numbers: " + countEven);
        System.out.println("Odd numbers: " + countOdd);
    }
}
