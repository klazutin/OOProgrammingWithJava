
public class MyDate {

    private int day;
    private int month;
    private int year;

    public MyDate(int pv, int kk, int vv) {
        this.day = pv;
        this.month = kk;
        this.year = vv;
    }

    public String toString() {
        return this.day + "." + this.month + "." + this.year;
    }

    public boolean earlier(MyDate compared) {
        if (this.year < compared.year) {
            return true;
        }

        if (this.year == compared.year && this.month < compared.month) {
            return true;
        }

        if (this.year == compared.year && this.month == compared.month
                && this.day < compared.day) {
            return true;
        }

        return false;
    }

    /*
     * In assignment 92 method differneceInYears was added to MyDate 
     * Copy the method here since it eases this assignment considerably.
     */
    public int differenceInYears(MyDate comparedDate){
        MyDate firstDate;
        MyDate secondDate;
        if (this.earlier(comparedDate)){
            System.out.println("this");
            firstDate = comparedDate;
            secondDate = this;
        } else {
            System.out.println("that");
            firstDate = this;
            secondDate = comparedDate;
        }

        int diffYear = firstDate.year - secondDate.year;
        int diffMonth = firstDate.month - secondDate.month;
        int diffDay = firstDate.day - secondDate.day;
        if (diffYear > 0){
            if (diffMonth > 0){
                return diffYear;
            } else if (diffMonth == 0) {
                if (diffDay >= 0) {
                    return diffYear;
                } else {
                    return diffYear - 1;
                }
            } else {
                return diffYear - 1;
            }
        } else {
            return diffYear;
        }        
    }

  
}