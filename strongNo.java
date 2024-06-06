import java.util.*;

class strongNo{
    public static void calcStrongNo(int n){
        int d;
        int sum = 0;
        int fact = 1;
        // while(n != 0){
            d = n%10;
            for(int i=d; i>=1; i--){
                fact = fact*i;
            }
            // n = n/10;
            // sum = sum + fact;
        System.out.print(d);
        }
        if(sum == n){
            // System.out.print("The no. is Strong Number");
        }
        else{
            // System.out.print("The no. is not Strong Number");
        }
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of n: ");
        int n = sc.nextInt();

        calcStrongNo(n);
    }
}