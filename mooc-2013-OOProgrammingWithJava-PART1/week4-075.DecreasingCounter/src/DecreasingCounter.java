public class DecreasingCounter {
    private int value;  // instance variable that remembers the value of the counter
    private int savedValueAtStart;

    public DecreasingCounter(int valueAtStart) {
        value = valueAtStart;
        savedValueAtStart = valueAtStart;
    }

    public void printValue() {
        // do not touch this!
        System.out.println("value: " + value);
    }

    public void decrease() {
        // write here code to decrease counter value by one
        if (value>0) {
            value-=1;
        }
    }
    
    public void reset() {
        value = 0;
    }
    
    public void setInitial() {
        value = savedValueAtStart;
    }

    // and here the rest of the methods
}
