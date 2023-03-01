import java.util.*;

public class range_prime {

    public static boolean prime(int n){
        boolean ans = true;

        if(n<2){
            ans = false;
        }
        else{
            for(int i = 2; i<=Math.sqrt(n); i++){
                if(n%i==0){
                    ans = false;
                    break;
                }
            }
        }
        return ans;
    }

    public static void range_of_prime(int a, int b){
        for(int i = a; i<=b; i++){
            if(prime(i)){
                System.out.print(i + " ");
            }
        }
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int s,e;
        System.out.print("Enter range a & b : ");
        s = sc.nextInt();
        e = sc.nextInt();

        range_of_prime(s, e);

    }
}
