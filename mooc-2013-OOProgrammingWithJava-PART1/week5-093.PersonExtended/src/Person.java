import java.util.Calendar;

public class Person {
    private String name;
    private MyDate birthday;
    
    public Person(String name, int pp, int kk, int vv) {
        this.name = name;
        this.birthday = new MyDate(pp, kk, vv);
    }
    
    public Person(String name, MyDate birthday){
        this.name = name;
        this.birthday = birthday;
    }
    
    public Person(String name){
        int curYear = Calendar.getInstance().get(Calendar.YEAR);
        int curMonth = Calendar.getInstance().get(Calendar.MONTH) + 1;
        int curDay = Calendar.getInstance().get(Calendar.DATE);
        MyDate today = new MyDate(curDay, curMonth, curYear);        
        this.name = name;
        this.birthday = today;
    }
    
    public int age() {
        int curYear = Calendar.getInstance().get(Calendar.YEAR);
        int curMonth = Calendar.getInstance().get(Calendar.MONTH) + 1;
        int curDay = Calendar.getInstance().get(Calendar.DATE);
        MyDate today = new MyDate(curDay, curMonth, curYear);
        return today.differenceInYears(this.birthday);
    }
    
    public boolean olderThan(Person compared) {
        if (this.birthday.earlier(compared.birthday)){
            return true;
        } else {
            return false;
        }
    }
    
    public String getName() {
        return this.name;
    }
    
    public String toString() {
        return this.name + ", born " + this.birthday;
    }
}
