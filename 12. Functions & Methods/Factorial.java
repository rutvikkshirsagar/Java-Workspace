import java.util.*;
public class Factorial {

    public static int factorial(int n){
        int ans=1;
        for(int i = 1; i<=n; i++){
            ans = ans * i;
        }
        return ans;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter value of n : ");
        int n = sc.nextInt();

        int ans = factorial(n);
        System.out.println("Answer of "+ n+"! is "+ans+".");
    }
}
