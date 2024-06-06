import java.util.*;

class maxMinDigitInNo{
    public static void minMax(int n){
        int d;
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        while(n!=0){
            d = n%10;
		    max = Math.max(max,d);
            min = Math.min(min,d);
		    n = n/10;
        }
	System.out.println("The maximum number is: "+max);
    System.out.println("The minimum number is: "+min);
    }
    public static void main(String[] args){
        Scanner sc = new Scanner (System.in);
        System.out.print("Enter the value of n: ");
        int n = sc.nextInt();

        minMax(n);       
    }
}