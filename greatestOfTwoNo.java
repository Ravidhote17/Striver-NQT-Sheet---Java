import java.util.*;

class greatestOfTwoNo{
    public static void main(String[] args){
        System.out.print("Enter the value of a: ");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        System.out.print("Enter the value of b: ");
        int b = sc.nextInt();

        if(a>b){
            System.out.print(a+" is greater than "+b);
        }else{
            System.out.print(b+" is greater than "+a);
        }
    }
}

// ANOTHER APPROACH
class greatestOfTwoNo{
    public static void main(String[] args){
        System.out.print("Enter the value of a: ");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        System.out.print("Enter the value of b: ");
        int b = sc.nextInt();

        System.out.print("The greatest no. between a and b is "+ Math.max(a,b));        
    }
}
