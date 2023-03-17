
// Finding Factorial & sum of N using recursion
import java.util.*;

public class factorial_recursion {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a value of N : ");
        int N = sc.nextInt();
        System.out.println(factorial(N));
        System.out.println(sum(N));

    }

    public static int factorial(int n){
        // base case
        if(n==1){
            return 1;
        }
        return (n*factorial(n-1));
    }

    public static int sum(int n){
        // base case
        if(n==0){
            return 0;
        }
        return n + sum(n-1);
    }
}
