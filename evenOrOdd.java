import java.util.Scanner;

class evenOrOdd{
     public static void main(String[] args){
        System.out.print("Enter the number: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        if(n%2==0){
            System.out.println("Number is Even");
        }else{
            System.out.print("Number is Odd");
        }
     }
}