import java.util.*;

// class greatestOfThreeNo{
//     public static void main(String[] args){
//         System.out.print("Enter the value of a: ");
//         Scanner sc = new Scanner(System.in);
//         int a = sc.nextInt();
//         System.out.print("Enter the value of b: ");
//         int b = sc.nextInt();        
//         System.out.print("Enter the value of c: ");
//         int c = sc.nextInt();

//         if(a>b && a>c){
//             System.out.print("a is greater than b and c");
//         }
//         else if(b>a && b>c){
//             System.out.print("b is greater than a and c");
//         }
//         else{
//             System.out.print("c is greater than a and b");
//         }
//     }
// }

// APPROACH 2
class greatestOfThreeNo{
    public static void main(String[] args){
        System.out.print("Enter the value of a: ");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        System.out.print("Enter the value of b: ");
        int b = sc.nextInt();        
        System.out.print("Enter the value of c: ");
        int c = sc.nextInt();

        System.out.print("The greatest no. is: "+ Math.max(a, Math.max(b,c)));
    }
}
