public class Main {
    public static void main(String[] args) {
        DecreasingCounter counter = new DecreasingCounter(10);

        counter.printValue();
        counter.decrease();
        counter.decrease();
        counter.printValue();
        
        DecreasingCounter newCounter = new DecreasingCounter(10);
        System.out.println("new: ");
        newCounter.printValue();
        newCounter.setInitial();
        newCounter.printValue();
    }
}
