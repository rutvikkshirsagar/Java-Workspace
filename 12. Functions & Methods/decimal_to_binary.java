import java.util.*;

public class decimal_to_binary {

    public static int decToBin(int n){
        int ans=0;
        int ctn = 0;

        while(n>0){
            int rem = n%2;
            ans = ans + (rem * (int)Math.pow(10,ctn));
            ctn++;
            n=n/2;
        }

        return ans;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter value of n : ");
        int n = sc.nextInt();

        int ans = decToBin(n);
        System.out.print("Conversion of decimal "+n+" to binary is "+ans+".");

    }
}
