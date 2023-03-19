// Friends pairing Problem
// Given n frineds, each one can remain single or can be paired up
// with some other frineds. Each friend can paired only once. 
// Find out the total number of ways in which frineds can remain single
// or can be paired up.
import java.util.*;
public class friends_pairing {
    // public static int friendsPairing(int n){
    //     //base case
    //     if(n==1 || n==2){
    //         return n;
    //     }
    //     int fnm1 = friendsPairing(n-1);
    //     int fnm2 = friendsPairing(n-2);

    //     return fnm1 + (fnm1 * fnm2);
    // }

    public static int friendsPairing(int n){
        //base case
        if(n==1 || n==2){
            return n;
        }
        return friendsPairing(n-1) + (n-1)*friendsPairing(n-2);
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a value of n : ");
        int n = sc.nextInt();
        System.out.print("Total ways of arrangement is "+friendsPairing(n)+".");        
    }
}
