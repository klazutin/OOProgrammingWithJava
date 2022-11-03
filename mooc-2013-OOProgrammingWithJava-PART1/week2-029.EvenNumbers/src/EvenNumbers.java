
public class EvenNumbers {

    public static void main(String[] args) {
        // Write your code here
        Integer num = 2;
        while (num <= 100) {
            if (num % 2 == 0) {
                System.out.println(num);
            };
            num++;
        }
    }
}
