import java.util.*;

class sumOfDigit{
    public static int getSum(int n){
        int d;
        int sum = 0;
        while(n != 0){
            d = n%10;
            sum = sum +d;
            n = n/10;
        }
        return sum;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of n: ");
        int n = sc.nextInt();

        int result = getSum(n);
        System.out.print(result);
    }
}