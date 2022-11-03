
public class Main {

    public static void main(String[] args) {
        int[] numbers = {1, 2, 3};
        int i = 0;
        while (i < numbers.length){
            System.out.println(i + ": " + numbers[i]);
            i++;
        };
        System.out.println("hey");
        for (int k : numbers){
            System.out.println(k);
        }
        System.out.println("hi");
        for(int j = 0; j < numbers.length; j++){
            System.out.println(j + ": " + numbers[j]);
        }
    }
}
