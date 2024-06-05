import java.util.*;

class reverseDigit{
    public static int getReverse(int n){
        int d;
        int rev = 0;
        while(n!=0){
            d = n%10;
            rev = rev *10 + d;
            n = n/10;
        }
        return rev;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of n: ");
        int n = sc.nextInt();

        int result = getReverse(n);
        System.out.print(result);
    }
}