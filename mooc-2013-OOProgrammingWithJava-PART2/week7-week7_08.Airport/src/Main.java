import java.util.Scanner;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        // Write your main program here. Implementing your own classes will be useful.
        Scanner reader = new Scanner(System.in);
        AirplaneList airplaneList = new AirplaneList();
        FlightList flightList = new FlightList(airplaneList);
        
        TextUI ui = new TextUI(reader, airplaneList, flightList);
        ui.start();
    }
}
