
import java.util.ArrayList;
import java.util.HashMap;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author klazutin
 */
public class VehicleRegister {
    private HashMap<RegistrationPlate, String> owners = new HashMap<RegistrationPlate, String>();

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    }
    
    public boolean add (RegistrationPlate plate, String owner){
        if (!this.owners.containsKey(plate) || (this.owners.containsKey(plate) && this.owners.get(plate) == null)){
            this.owners.put(plate, owner);
            return true;
        } else {
            return false;
        }
    }
    
    public String get(RegistrationPlate plate){
        if (this.owners.containsKey(plate)){
            return this.owners.get(plate);
        } else {
            return null;
        }
    }
    
    public boolean delete(RegistrationPlate plate){
        if (this.owners.containsKey(plate)){
            this.owners.remove(plate);
            return true;
        } else {
            return false;
        }
    }
    
    public void printRegistrationPlates(){
        for (RegistrationPlate plate : owners.keySet()){
            System.out.println(plate);
        }
    }
    
    public void printOwners(){
        ArrayList<String> temp = new ArrayList<String>();
        for (RegistrationPlate plate : owners.keySet()){
            String owner = owners.get(plate);
            if (!temp.contains(owner)){
                System.out.println(owner);
                temp.add(owner);
        }
    }
    }
    
}
