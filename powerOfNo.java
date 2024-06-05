import java.util.*;

class power{
    public static int calcPower(int x, int n){
        int ans = 1;
        for(int i=1; i<=x; i++){
            ans = ans*n;
        }
        return ans;
    } 

    public static void main(String[] args){
        Scanner sc = new Scanner (System.in);
        System.out.print("Enter the value of n: ");
        int n = sc.nextInt();
        System.out.print("Enter the value of power: ");
        int x = sc.nextInt();

        int p = calcPower(x, n);
        System.out.print(p);
    }
}