
import java.util.Arrays;
public class Main {

    public static void main(String[] args) {
        // write testcode here
        int[] original = {1, 2, 3, 4};
        int[] reverse = reverseCopy(original);

        // print both
        System.out.println( "original: " +Arrays.toString(original));
        System.out.println( "reversed: " +Arrays.toString(reverse));     
    }
    
    public static int[] copy(int[] array){
        int[] clone = array.clone();
        return clone;
    }
    
    public static int[] reverseCopy(int[] array){
        int[] result = new int[array.length];
        for (int i = array.length; i > 0; i--){
//            System.out.println(i);
//            System.out.println(result.length);
            result[result.length - i ] = array[i-1];
        }
        return result;
    }
}
