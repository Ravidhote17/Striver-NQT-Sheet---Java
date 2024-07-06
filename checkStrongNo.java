import java.util.*;

class checkStrongNo{
    public static void main(String[] args){
        int n,c,s, sum=0;
        System.out.print("Enter the value of n: ");
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        c=n;

        while(n>0){
            s=n%10;
            int fact=1;
            for(int i=s; i>=1; i--){
                fact = fact*i;
            }
            sum = sum + fact;
            n=n/10;
        }
        if(c==sum){
            System.out.print("Strong Number");
        }
        else{
            System.out.print("Not Strong Number");            
        }
    }
}


