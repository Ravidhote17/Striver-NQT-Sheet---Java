import java.util.*;

class factors{
    public static void calcFactors(int n){
     for(int i=1; i<=n; i++){
            if(n%i==0){
                System.out.print(i+" ");
            }
        }   
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the vaue of n: ");
        int n = sc.nextInt();
        System.out.print("factors is: ");
        
        calcFactors(n);
    }
}