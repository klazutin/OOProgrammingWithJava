
public class Smileys {

    public static void main(String[] args) {
        // Test your method at least with the following
         printWithSmileys("Method");
         printWithSmileys("Beerbottle");
         printWithSmileys("Interface");
    }
    
    private static void printWithSmileys(String characterString){
        String smiley = ":)";
        if (characterString.length() % 2 != 0){
            characterString += " ";
        }
        for (int i = 1; i < characterString.length()/2 + 4; i++){
            System.out.print(smiley);
        }
        System.out.println("");
        System.out.println(smiley + " " + characterString + " " + smiley);
        for (int i = 1; i < characterString.length()/2 + 4; i++){
            System.out.print(smiley);
        }
        System.out.println("");
    }

}
