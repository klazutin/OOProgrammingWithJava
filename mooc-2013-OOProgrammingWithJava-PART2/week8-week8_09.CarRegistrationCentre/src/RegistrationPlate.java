
public class RegistrationPlate {
    // don't change the code which is already given to you

    // ATTENTION: the object variable types are final, meaning that their value cannot be changed!
    private final String regCode;
    private final String country;

    public RegistrationPlate(String country, String regCode) {
        this.regCode = regCode;
        this.country = country;
    }

    @Override
    public String toString() {
        return country + " " + regCode;
    }
    
    @Override
    public boolean equals(Object object){
        if (object == null){
            return false;
        };
        
        if (this.getClass() != object.getClass()){
            return false;
        }
        
        RegistrationPlate other = (RegistrationPlate) object;
        
        if (this.regCode == null || !this.regCode.equals(other.regCode)){
            return false;
        }
        
        if (this.country == null || !this.country.equals(other.country)){
            return false;
        }
        
        return true;
    }
    
    @Override
    public int hashCode(){
        return this.regCode.hashCode() + this.country.hashCode();
    }

}