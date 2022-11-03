
import java.util.HashMap;
import java.util.Map;

public class Nicknames {

    public static void main(String[] args) {
        // Do the operations requested in the assignment here!
        HashMap<String, String> hm = new HashMap<String, String>();
        hm.put("matti", "mage");
        hm.put("mikael", "mixu");
        hm.put("arto", "arppa");
        System.out.println(hm.get("mikael"));
    }

}
