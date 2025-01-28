import java.util.*;

class checkStringPalindrome{
    public static void main(String[] args){
        System.out.print("Enter String: ");
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        int left = 0;
        int right = str.length()-1;

        boolean isPalindrome = true;

        while(left<right){
            if(str.charAt(left) != str.charAt(right)){
                isPalindrome = false;
                break;
            }
            left++;
            right--;
        }
        
        if (isPalindrome) {
            System.out.println(str + " is a palindrome.");
        } else {
            System.out.println(str + " is not a palindrome.");
        }

    }
}