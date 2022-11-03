public class PrintingLikeBoss {

    // copy or rewrite the method of Assignment 39.1 here
    public static void printStars(int amount) {
        while (amount > 0) {
            System.out.print("*");
            amount--;
        }
        System.out.println("");
    }

    public static void printWhitespaces(int amount) {
        while (amount > 0) {
            System.out.print(" ");
            amount--;
        }
        // 40.1
    }

    public static void printTriangle(int size) {
        int stars = 1;
        while (size > 0) {
            printWhitespaces(size-1);
            printStars(stars);
            stars++;
            size--;
        }
        // 40.2
    }

    public static void xmasTree(int height) {
        int stars = 1;
        int maxStars = (height * 2) - 1;
        int stemStars = maxStars;
        while (height > 0){
            printWhitespaces((maxStars-1)/2);
            printStars(stars);
            stars += 2;
            height--;
            maxStars -= 2;
        }
        // stem
        printWhitespaces((stemStars-3)/2);
        printStars(3);
        printWhitespaces((stemStars-3)/2);
        printStars(3);        
        // 40.3
    }

    public static void main(String[] args) {
        // Tests do not use main, yo can write code here freely!

        printTriangle(5);
        System.out.println("---");
        xmasTree(4);
        System.out.println("---");
        xmasTree(10);
    }
}
