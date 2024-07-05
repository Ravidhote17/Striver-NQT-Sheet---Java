import java.util.*;

class checkPrimeNo{
    public static void main(String[] args){
        int n, count=0;
        System.out.print("Enter the value of n: ");
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();

        for(int i=1; i<=n; i++){
            if(n%i==0){
                count++;
            }
        }
        if(count==2){
            System.out.print("Prime Number");
        }
        else{
            System.out.print("Not Prime Number");
        }
    }
}