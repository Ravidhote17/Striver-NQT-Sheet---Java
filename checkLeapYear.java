import java.util.*;

class checkLeapYear{
    public static void main(String[] args){
        int year;
        System.out.print("Enter the year: ");
        Scanner sc = new Scanner(System.in);
        year = sc.nextInt();

        if((year%400==0) || (year%4==0 && year%100!=0)){
            System.out.print("It's a leap year");
        }
        else{
            System.out.print("It's not a leap year");
        }
    }
}