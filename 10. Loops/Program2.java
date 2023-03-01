package Loops;
import java.util.*;
public class Program2 {
    public static void main(String args[]){

        // sum of n natural numbers -- using for loop

        int n,sum1=0,sum2=0;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter value of n : ");
        n = sc.nextInt();

        for(int i = 1; i<=n; i++){
            sum1+=i;
        }
        System.out.println("Sum of first "+n+" natural numbers are "+ sum1+".");

        // sum of first n natural number -- using while loop

        int j = 1;
        while(j<=n){
            sum2+=j;
            j++;
        }
        System.out.println("Sum of first "+n+" natural numbers are "+ sum2+".");
    }
}
