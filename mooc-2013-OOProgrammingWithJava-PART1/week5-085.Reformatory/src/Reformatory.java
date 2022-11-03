public class Reformatory {
    private int weightsMeasured = 0;

    public int weight(Person person) {
        this.weightsMeasured++;
        return person.getWeight();
    }
    
    public void feed(Person person){
        person.setWeight(person.getWeight() + 1);
    }
    
    public int totalWeightsMeasured(){
        return this.weightsMeasured;
    }

}