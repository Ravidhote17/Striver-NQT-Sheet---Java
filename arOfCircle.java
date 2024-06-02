import java.util.*;

class arOfCircle{
    public static void main(String[] args){
        double pie = 3.14;
        System.out.print("Enter the value of r: ");
        Scanner sc = new Scanner(System.in);
        double r = sc.nextDouble();
        
        double area = (pie*r*r);
        System.out.print(area); 
    }
}