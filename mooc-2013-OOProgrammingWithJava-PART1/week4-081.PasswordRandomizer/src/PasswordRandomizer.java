import java.util.Random;

public class PasswordRandomizer {
    int length;
    // Define the variables

    public PasswordRandomizer(int length) {
        // Initialize the variable
        this.length = length;
    }

    public String createPassword() {
        // write code that returns a randomized password
        Random random = new Random();
        String result = "";
        int i = 0;
        while (i < this.length) {
            char character = "abcdefghijklmnopqrstuvwxyz".charAt(random.nextInt(23));
            result += character;
            i++;
        }
        return result;
    }
}