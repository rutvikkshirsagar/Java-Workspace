// You are given a number (eg -  2019), convert it into a String of english like“two zero one nine”.  
// Use a recursive function to solve this problem.
// NOTE-The digits of the number will only bein the range 0-9 and the last digit of a number can’t be 0.

import java.util.*;
public class english_string {

    static String digits[] = {"zero","One","Two","Three","Four","Five","Six","Seven","Eight","Nine"};

    public static void digitToString(int number){
        // base case
        if(number == 0){
            return;
        }
        // kamm
        int lastdigit = number%10;
        digitToString(number/10);
        System.out.print(digits[lastdigit]+" ");
    }
    public static void main(String args[]){
        digitToString(2001);
    }
}
