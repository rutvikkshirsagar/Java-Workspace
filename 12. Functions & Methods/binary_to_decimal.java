import java.util.*;

public class binary_to_decimal {

    public static int bin_to_dec(int n){
        int ans = 0;
        int cnt = 0;

        while(n>0){
            int last = n%10;
            ans = ans + (last * (int)Math.pow(2,cnt));
            cnt++;
            n/=10;
        }

        return ans;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter binary number : ");
        int n = sc.nextInt();

        int ans = (int) bin_to_dec(n);

        System.out.println("Conversion of "+ n+" to decimal is "+ ans+".");


    }
}
