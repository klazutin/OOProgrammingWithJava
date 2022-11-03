// This is not an exercise but a "sandbox" where you can freely test
// whatever you want

public class Application {

    public static void main(String[] args) {
//        String name = "Konstantin2";
//        System.out.println(name);
//        name = name + " is göd";
//        System.out.println(name);
        int first = 3;
        int second = 2;
        double sum = first / second * 1.0;
//        System.out.println(sum);
        // Write the code here. You can run the code by 
        // selecting Run->Run File from the menu or by pressing Shift+F6
        
        testClass test = new testClass(5);
        System.out.println("showing: ");
        test.show();
        System.out.println(test.getAge());
    }
}
