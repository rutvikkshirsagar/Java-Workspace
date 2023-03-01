import java.util.*;
public class Binomial_coefficient {

    public static int factorial(int n){
        int ans=1;
        for(int i = 1; i<=n; i++){
            ans = ans * i;
        }
        return ans;
    }

    public static int binomial(int a, int b){
        int ans;
        ans = factorial(a)/(factorial(b)*factorial((a-b)));
        return ans;
    }
    
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int a,b;
        System.out.print("Enter value of a & b : ");
        a = sc.nextInt();
        b = sc.nextInt();

        System.out.println("Value of binomial co-efficient of "+ a+ " & "+ b+" is "+ binomial(a, b));
    }
}
