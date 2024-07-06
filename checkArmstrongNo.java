import java.util.*;

class checkArmstrongNo{
    public static void main(String[] args){
        int num,n1, n2, r, length=0, arm=0;
        System.out.print("Enter num: ");
        Scanner sc = new Scanner(System.in);
        num = sc.nextInt();
        n1 = num;
        n2 = num;

        while(n1>0){
            n1 = n1/10;
            length++;
        }

        while(n2>0){
            r = n2%10;
            int mult = 1;
            for(int i=1; i<=length; i++){
                mult = mult*r;
            }
            arm = arm + mult;
            n2 = n2/10;
        }
        if(num==arm){
            System.out.print("Armstrong Number");
        }
        else{
            System.out.print("Not Armstrong Number");            
        }
    }
}