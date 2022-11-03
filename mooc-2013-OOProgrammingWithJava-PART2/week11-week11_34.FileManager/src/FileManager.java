
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FileManager {

    public List<String> read(String file) throws FileNotFoundException {
        List<String> res = new ArrayList<String>();
        File f = new File(file);
        Scanner fs = new Scanner(f);
        while (fs.hasNextLine()) {
            res.add(fs.nextLine());
        }
        return res;
    }

    public void save(String file, String text) throws IOException {
        FileWriter fw = new FileWriter(file);
        fw.append(text);
        fw.close();
    }

    public void save(String file, List<String> texts) throws IOException {
        FileWriter fw = new FileWriter(file);
        for (String t : texts) {
            fw.append(t + "\n");
        }
        fw.close();
    }
}
