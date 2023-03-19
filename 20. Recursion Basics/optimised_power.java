// Find power x^n with optimised approach
import java.util.*;
public class optimised_power {
    public static int power(int x, int n){
        //base case
        // here logic is right but still t-comp is O(n) // linear
        // if(n == 0){
        //     return 1;
        // }
        
        // if(n%2==0){
        //     return power(x, n/2) * power(x, n/2);
        // }
        // else{
        //     return power(x, n/2) * power(x, n/2) * x;
        // }

        // here is optimised approach

        // base case
        if(n == 0){
            return 1;
        }
        int halfcount = power(x,n/2);
        int halfcountSqr = halfcount * halfcount;
        if(n%2!=0){
            halfcountSqr = x * halfcountSqr;
        }
        return halfcountSqr;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter value of x & n : ");
        int x = sc.nextInt();
        int n = sc.nextInt();
        System.out.print("Power of "+x+" base "+n+" is "+power(x, n)+".");
    }
}
