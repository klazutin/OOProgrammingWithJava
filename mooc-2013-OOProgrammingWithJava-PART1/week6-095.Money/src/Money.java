
public class Money {

    private final int euros;
    private final int cents;

    public Money(int euros, int cents) {

        if (cents > 99) {
            euros += cents / 100;
            cents %= 100;
        }

        this.euros = euros;
        this.cents = cents;
    }

    public int euros() {
        return euros;
    }

    public int cents() {
        return cents;
    }

    @Override
    public String toString() {
        String zero = "";
        if (cents < 10) {
            zero = "0";
        }

        return euros + "." + zero + cents + "e";
    }
    
    public Money plus(Money added){
        int resultEuros = this.euros + added.euros;
        int resultCents = this.cents + added.cents;
        if (resultCents >= 100){
            resultEuros += 1;
            resultCents %= 100;
        }
        return new Money(resultEuros, resultCents);
    }
    
    public boolean less(Money compared){
        double thisMoney = this.euros + this.cents / 100.0;
        double thatMoney = compared.euros + compared.cents / 100.0;
        System.out.println(thisMoney);
        System.out.println(thatMoney);
        if (thisMoney < thatMoney){
            return true;
        } else {
            return false;
        }
    }
    
    public Money minus(Money decremented){
        int resultEuros = this.euros - decremented.euros;
        int resultCents = this.cents - decremented.cents;        
        if (this.less(decremented)){
            return new Money(0, 0);
        } else {
            if (resultCents < 0) {
                resultEuros -= 1;
                resultCents += 100;
                resultCents %= 100;
            }
        }
        return new Money(resultEuros, resultCents);
    }

}
