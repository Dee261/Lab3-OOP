import java.util.Scanner;

public class LeapYearTester {

    public static void main(String[] args) {
        System.out.print("***Test -whether a given year is a leap year or not***\n ");
        System.out.print("Enter an year\n\n ");

        Scanner in=new Scanner(System.in);
        int input=Integer.parseInt(in.nextLine());

        LeapYearDecider ob=new LeapYearDecider();
        System.out.print(input + " is a leap year ? " + ob.isLeapYear(input));
    }

}
