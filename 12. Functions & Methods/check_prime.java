import java.util.*;

public class check_prime {

    public static boolean prime(int n){
        boolean ans = true;

        if(n<2){
            ans = false;
        }
        else{
            for(int i = 2; i<Math.sqrt(n); i++){
                if(n%i==0){
                    ans = false;
                    break;
                }
            }
        }
        return ans;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter value of n to check prime or not : ");
        int n = sc.nextInt();
        boolean ans = prime(n);
        if(ans){
            System.out.println(n+" is prime number.");
        }
        else{
            System.out.println(n+" is not prime number.");
        }

    }   
}
