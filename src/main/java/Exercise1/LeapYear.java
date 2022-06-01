package Exercise1;

public class LeapYear {
    int year;

    static boolean  leap;
    static boolean checkLeapYear(int year){
        if (year % 4==0){
            if (year % 100 ==0){
                leap = year % 400 == 0;
            }
            else leap =true;
        }
        else leap=false;
        if (leap)
            System.out.println( year + " is leap year");
        else
            System.out.println(year + " is not leap year");

            return true;


    }

    public static void main(String[] args) {
        checkLeapYear(1998);


    }

}
