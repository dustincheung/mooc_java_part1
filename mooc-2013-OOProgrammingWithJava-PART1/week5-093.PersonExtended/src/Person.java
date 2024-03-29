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
        int currDay = Calendar.getInstance().get(Calendar.DATE);
        int currMonth = Calendar.getInstance().get(Calendar.MONTH) + 1; // January is 0 so we add one
        int currYear = Calendar.getInstance().get(Calendar.YEAR);
        MyDate currDate = new MyDate(currDay, currMonth, currYear);

        this.name = name;
        this.birthday = currDate;
    }

    public int age() {
// calculate the age based on the birthday and the current day
        int currDay = Calendar.getInstance().get(Calendar.DATE);
        int currMonth = Calendar.getInstance().get(Calendar.MONTH) + 1; // January is 0 so we add one
        int currYear = Calendar.getInstance().get(Calendar.YEAR);

        MyDate currDate = new MyDate(currDay, currMonth, currYear);
        return currDate.differneceInYears(this.birthday);
    }
    
    public boolean olderThan(Person compared) {
        if(this.birthday.earlier(compared.birthday)){
            return true;
        }
        return false;
    }
    
    public String getName() {
        return this.name;
    }
    
    public String toString() {
        return this.name + ", born " + this.birthday;
    }
}
