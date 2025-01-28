import java.util.*;

// class countVowelConstSpc{
//     public static void main(String[] args){
//         System.out.print("Enter String: ");
//         Scanner sc = new Scanner(System.in);
//         String str = sc.nextLine();

//         int vowel=0;
//         int constant =0;
//         int space = 0;

//         for(int i=0; i<=str.length()-1; i++){
//             char ch = str.charAt(i);
//             if(ch== 'a' || ch== 'e' || ch== 'i' || ch== 'o' || ch== 'u'){
//                 vowel++;
//             }
//             else if(ch>= 'a' && ch<= 'z'){
//                 constant++;
//             }
//             else if(ch == ' '){
//                 space++;
//             }
//         }

//         System.out.println(vowel);
//         System.out.println(constant);
//         System.out.println(space);
//     }

// }

public class tUf {
  public static void solve(String str, int length) {
    int vowels = 0, consonants = 0, whitespaces = 0;
    str = str.toLowerCase(); // converting given string to lowercase
    for (int i = 0; i < length; i++) {
      char ch = str.charAt(i);
      if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u')
        vowels++;
      else if (ch >= 'a' && ch <= 'z')
        consonants++;
      else if (ch == ' ')
        whitespaces++;
    }

    System.out.println("Vowels: " + vowels);
    System.out.println("Consonants: " + consonants);
    System.out.println("White spaces: " + whitespaces);
  }
  public static void main(String args[]) {
    String str = "Take u forward is Awesome";
    int length = str.length();
    solve(str, length);
  }
}