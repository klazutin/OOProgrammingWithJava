
public class Bird {

    private String name;
    private String latinName;
    private int ringingYear;

    public Bird(String name, String latinName, int ringingYear) {
        this.name = name;
        this.latinName = latinName;
        this.ringingYear = ringingYear;
    }


    @Override
    public String toString() {
        return this.latinName + " (" + this.ringingYear + ")";
    }
    
    @Override
    public boolean equals(Object other) {
        try { 
            Bird otherBird = (Bird) other;
            return this.latinName == otherBird.latinName && this.ringingYear == otherBird.ringingYear;
        } catch (Exception e) {
            return false;
        }
        
    }
    
    @Override
    public int hashCode(){
        String combinedString;
        combinedString = this.latinName + String.valueOf(this.ringingYear);
        return combinedString.hashCode();
    }
}


