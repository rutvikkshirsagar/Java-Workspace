import java.util.*;

public class HM_Que1 {
    public static boolean Palendrome(int n){
        boolean ans = false;
        int new_num = 0;
        int ctn = 0;

        int old_n = n;

        while(n>0){
            int last = n%10;
            new_num = new_num*10 + last;
            ctn++;
            n=n/10;
        }
        
        if(old_n==new_num){
            ans = true;
        }
        return ans;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter value of n :");
        int n = sc.nextInt();

        if(Palendrome(n)){
            System.out.print("Given number "+ n+" is palindrome.");
        }
        else{
            System.out.print("Given number "+n+" is not palindrome.");
        }
    }
}
