import java.util.*;

class factorial{
    public static int calculateFactorial(int n){
        int factorial = 1;
        for(int i=n; i>=1; i--){
            factorial = factorial*i;
        }
        return factorial;
    }

    public static void main(String[] args){
        Scanner sc = new Scanner (System.in);
        System.out.print("Enter the value of n: ");
        int n = sc.nextInt();

    int factorial = calculateFactorial(n);
    System.out.print(factorial);
    }
}