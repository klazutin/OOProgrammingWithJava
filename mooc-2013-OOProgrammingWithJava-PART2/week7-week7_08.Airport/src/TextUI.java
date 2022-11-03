/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author klazutin
 */
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;

public class TextUI {
    private Scanner reader;
    private AirplaneList airplaneList;
    private FlightList flightList;
    
    public TextUI(Scanner reader, AirplaneList airplaneList, FlightList flightList){
        this.reader = reader;
        this.airplaneList = airplaneList;
        this.flightList = flightList;
    }
    
    void addAirplane(){
        System.out.print("Give plane ID: ");
        String planeID = this.reader.nextLine();
        System.out.print("Give plane capacity: ");
        int planeCap = Integer.parseInt(this.reader.nextLine());
        this.airplaneList.add(planeID, planeCap);
    }
    
    void addFlight(){
        System.out.print("Give plane ID: ");
        String planeId = this.reader.nextLine();
        System.out.print("Give departure airport code: ");
        String depCode = this.reader.nextLine();
        System.out.print("Give destination airport code: ");
        String destCode = this.reader.nextLine();
        this.flightList.add(depCode + "-" + destCode, planeId);
    }
    
    void airportPanel(){
        while(true){
            System.out.println("Airport panel");
            System.out.println("--------------------");
            System.out.println("Choose operation:");
            System.out.println("[1] Add airplane");
            System.out.println("[2] Add flight");
            System.out.println("[x] Exit");
            String command = this.reader.nextLine();
            if (command.equals("x")){
                break;
            } else if (command.equals("1")){
                addAirplane();
            } else if (command.equals("2")){
                addFlight();
            }
        }
    }
    
    void printPlanes(){
        airplaneList.printAll();
    }
    
    void printFlights(){
        flightList.printAll();
    }
    
    void printPlane(){
        System.out.print("Give plane ID: ");
        String planeID = this.reader.nextLine();
        airplaneList.printPlane(planeID);
    }
    
    void flightService(){
        while(true){
            System.out.println("Flight service");
            System.out.println("------------");
            System.out.println("Choose operation:");
            System.out.println("[1] Print planes");
            System.out.println("[2] Print flights");
            System.out.println("[3] Print plane info");
            System.out.println("[x] Quit");
            String command = this.reader.nextLine();
            if (command.equals("x")){
                break;
            } else if (command.equals("1")){
                printPlanes();
            } else if (command.equals("2")){
                printFlights();
            } else if (command.equals("3")){
                printPlane();
            }
        }
    }
    
    void start(){
        airportPanel();
        flightService();
    }
    
}
