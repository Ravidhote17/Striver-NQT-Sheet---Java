import java.util.Scanner;

class sumOfNno{
    public static void main(String[] args){
        System.out.print("Enter the number: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 0;
        for(int i=0; i<=n; i++){
            sum = sum + i;
        }
        System.out.print(sum);
    }
}