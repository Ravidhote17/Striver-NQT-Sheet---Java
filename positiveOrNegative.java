import java.util.Scanner;

class positiveOrNegative{
    public static void main(String[] args){
        System.out.print("Enter the number: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        if(n>0){
            System.out.print("Number is positive");
        }
        else if(n==0){
            System.out.print("Number is Zero");
        }
        else{
            System.out.print("Number is Negative");
        }
    }
}