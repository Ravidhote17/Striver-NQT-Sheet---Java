import java.util.*;

class checkPerfectNo{
    public static void main(String[] main){
        int n, sum=0;
        System.out.print("Enter the value of n: ");
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();

        for(int i=1; i<n; i++){
            if(n%i==0){
                sum = sum+i;
            }
        }
        if(sum == n){
        System.out.print("Perfect Number");
        }
        else{
        System.out.print("Not Perfect Number");                       
        }
    }
}