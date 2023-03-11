// Check String is Palindrome or not!

import java.util.Scanner;

public class check_palindrome {
    public static boolean palindrome(String str){
        boolean ans = true;
        for(int i = 0; i<str.length()/2; i++){
            if(str.charAt(i)!=str.charAt(str.length()-1-i)){
                ans = false;
            }
        }
        return ans;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter String to check palindrome : ");
        String str = sc.nextLine();

        if(palindrome(str)){
            System.out.println(str+" is palindrome!.");
        }
        else{
            System.out.println(str+" is not palindrome!.");
        }

    }
}
