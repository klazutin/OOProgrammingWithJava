
public class AverageOfGivenNumbers {
    
    // implement here again the method of exercise 43
    public static int sum(int number1, int number2, int number3, int number4) {
        return number1 + number2 + number3 + number4;
    }

    public static double average(int number1, int number2, int number3, int number4) {
        return sum(number1, number2, number3, number4) / 4.0;
    }

    public static void main(String[] args) {
        double result = average(4, 3, 6, 1);
        System.out.println("Average: " + result);
        System.out.println("---");
        String banana = "banana";
        System.out.println("Banana is " + banana.length());
        char character = banana.charAt(2);
        String test = String.valueOf(character);
        System.out.println(test);
        char last = banana.charAt(banana.length()-1);
        System.out.println(last);
        char first = banana.charAt(0);
        System.out.println(first);
    }
}
