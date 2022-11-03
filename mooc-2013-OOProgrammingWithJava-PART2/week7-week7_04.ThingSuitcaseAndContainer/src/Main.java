
public class Main {

    public static void main(String[] args) {
        // use this main class to test your program!
        Container container = new Container(1000);
        addSuitcasesFullOfBricks(container);
        System.out.println(container);

    }
    
    public static void addSuitcasesFullOfBricks(Container container){
        int brickWeight = 1;
        for (int i=0; i<100; i++){
            Suitcase sc = new Suitcase(100);
            Thing brick = new Thing("Brick", brickWeight);
            sc.addThing(brick);
            container.addSuitcase(sc);
            brickWeight++;
        }
    }

}
