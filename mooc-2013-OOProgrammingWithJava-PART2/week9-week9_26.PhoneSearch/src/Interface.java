
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author klazutin
 */
public class Interface {
    private Scanner reader = new Scanner(System.in);
    private PhoneBook pb = new PhoneBook();
    
    public Interface() {
        
    }
    
    public void go() {
        // Start your program here
        // ATTENTION: In your program, you can create only one instance of class Scanner!
        System.out.println("phone search\n" +
                "available operations:\n" +
                " 1 add a number\n" +
                " 2 search for a number\n" +
                " 3 search for a person by phone number\n" +
                " 4 add an address\n" +
                " 5 search for personal information\n" +
                " 6 delete personal information\n" +
                " 7 filtered listing\n" +
                " x quit");
        
        String command = "";
        while (!(command.equals("x"))) {
            System.out.println("");
            System.out.print("command: ");
            command = this.reader.next();
            parseCommand(command);
        }
    }
    
    private void parseCommand(String command){
        if (command.equals("1")) {
            addNumber();
        } else if (command.equals("2")) {
            getNumber();
        } else if (command.equals("3")) {
            getPerson();
        } else if (command.equals("4")) {
            addAddress();
        } else if (command.equals("5")) {
            getPersonalInformation();
        } else if (command.equals("6")) {
            deletePersonalInformation();
        } else if (command.equals("7")) {
            searchByKeyword();
        }
    }
    
    private void addNumber(){
        System.out.print("whose number: ");
        String name = reader.next();
        System.out.print("number: ");
        String number = reader.next();
        pb.addNumber(name, number);
    }
    
    private void getNumber(){
        System.out.print("whose number: ");
        String name = reader.next();
        ArrayList<String> numbers = pb.getNumber(name);
        if (numbers == null) {
            System.out.println("  not found");
        } else {
            for (String n : numbers) {
                System.out.println("  " + n);
            }
        }
    }    
    
    private void getPerson(){
        System.out.print("number: ");
        String number = reader.next();
        String person = pb.getPerson(number);
        if (person == null) {
            System.out.println("  not found");
        } else {
            System.out.println(person);
        }
    }
    
    private void addAddress(){
        System.out.print("whose address: ");
        String name = reader.next();        
        System.out.print("street: ");
        String street = reader.next();        
        System.out.print("city: ");
        String city = reader.next();      
        pb.addAddress(name, street, city);
    }
    
    private void getPersonalInformation(){
        System.out.print("whose information: ");
        String name = reader.next();
        HashMap<String, String> address = pb.getAddress(name);
        ArrayList<String> numbers = pb.getNumber(name);
        if (address == null && numbers == null) {
            System.out.println("  not found");
            return;
        }
        if (address == null) {
            System.out.println("  address unknown");
        } else {
            System.out.println("  address: " + address.get("street") + " " + address.get("city"));
        }
        
        if (numbers == null) {
            System.out.println(" phone number not found");
        } else {
            System.out.println("  phone numbers:");
            for (String n : numbers) {
                System.out.println("    " + n);
            }
        }
    }
    
    private void deletePersonalInformation(){
        System.out.print("whose information: ");
        String name = reader.next();
        pb.deletePersonalInformation(name);
    }
    
    private void searchByKeyword(){
        System.out.print("keyword (if empty, all listed): ");
        String keyword = reader.next();
        ArrayList<String> matches = pb.searchByKeyword(keyword);
        if (matches.isEmpty()) {
            System.out.println("  not found");
        }
        for (String name : matches) {
            System.out.println("");
            System.out.println(" " + name);
            HashMap<String, String> address = pb.getAddress(name);
            ArrayList<String> numbers = pb.getNumber(name);
            if (address == null && numbers == null) {
                System.out.println("  not found");
                return;
            }
            if (address == null) {
                System.out.println("  address unknown");
            } else {
                System.out.println("  address: " + address.get("street") + " " + address.get("city"));
            }

            if (numbers == null) {
                System.out.println("  phone number not found");
            } else {
                System.out.println("  phone numbers:");
                for (String n : numbers) {
                    System.out.println("   " + n);
                }
            }
        }
    }
}
