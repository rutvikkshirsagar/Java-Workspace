// Calculating febonacci number using recursion
import java.util.*;
class febonacci{
    public static int fib(int n){
        if(n==0 || n==1){
            return n;
        }
        // int fiba = fib(n-1);
        // int fibb = fib(n-2);
        // int fib = fiba+fibb;

        return fib(n-1) + fib(n-2);
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter value of n : ");
        int n = sc.nextInt();
        System.out.println(fib(n));
    }
}

