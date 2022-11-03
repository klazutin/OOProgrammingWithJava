import java.util.ArrayList;
import java.util.Scanner;

public class Main {  

    public static void main(String[] args) {
        ArrayList<Bird> birds = new ArrayList<Bird>();
        Scanner s = new Scanner(System.in);
        while(true){
            System.out.print("? ");
            String command = s.nextLine();
            if(command.contains("Add")){
                System.out.print("Name: ");
                String name = s.nextLine();
                System.out.print("Latin Name: ");
                String latinName = s.nextLine();
                birds.add(new Bird(name, latinName));
            } else if(command.contains("Observation")) {
                System.out.print("What was observed?: ");
                String observed = s.nextLine();
                int counter = 0;
                for(Bird b : birds){
                    if(b.getName().equals(observed)){
                        b.observe();
                        counter++;
                    }
                }
                if(counter == 0){
                    System.out.println("Is not a bird!");
                }
            } else if(command.contains("Statistics")){
                for(Bird b : birds){
                    System.out.println(b);
                }
            } else if(command.contains("Show")){
                System.out.print("What? ");
                String query = s.nextLine();
                for(Bird b : birds){
                    if(b.getName().equals(query)){
                        System.out.println(b);
                    }
                }
            }
            else {
                break;
            }
        }
        
    // implement your program here
    // do not put all to one method/class but rather design a proper structure to your program
        
    // Your program should use only one Scanner object, i.e., it is allowed to call 
    // new Scanner only once. If you need scanner in multiple places, you can pass it as parameter
            
    }

}
