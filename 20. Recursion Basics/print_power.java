// Print x^n using recursion

import java.util.*;
public class print_power {
    public static int power(int x, int n){
        // base case
        if(n==0){
            return 1;
        }
        return x * power(x, n-1);
    }
    public static void main(String args[]){
        System.out.println(power(2 , 10));
    }
}
