
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        ArrayList<Student> list = new ArrayList<Student>();
        String name = "a";
        String number;
        Scanner s = new Scanner(System.in);
        while (true){
            System.out.print("name: ");
            name = s.nextLine();
            if (!name.isEmpty()){
                System.out.print("studentnumber: ");
                number = s.nextLine();
                list.add(new Student(name, number));
            } else {
                break;
            }
        }
        for (Student st : list){
            System.out.println(st.toString());
        }
        
        System.out.print("Give search term: ");
        String term = s.nextLine();
        if (!term.isEmpty()){
            System.out.println("Result:");
            for (Student stu : list){
                if (stu.getName().contains(term)){
                    System.out.println(stu.toString());
                }
            }
        };
    }
}