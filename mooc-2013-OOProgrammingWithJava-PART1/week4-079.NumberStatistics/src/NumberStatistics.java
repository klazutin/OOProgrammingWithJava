
public class NumberStatistics {
    private int amountOfNumbers = 0;
    private int sum = 0;
    
    public NumberStatistics() {
        
    }
    
    public void addNumber(int number) {
        this.amountOfNumbers += 1;
        this.sum += number;
    }
    
    public int amountOfNumbers() {
        return this.amountOfNumbers;
    }
    
    public int sum() {
        return this.sum;
    }
    
    public double average() {
        if (this.amountOfNumbers == 0) {return 0;};
        return ((double)this.sum / (double)this.amountOfNumbers);
    }
}
