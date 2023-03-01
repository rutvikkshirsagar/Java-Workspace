import java.util.*;

public class HM_Que1 {
    public static void main(String args[]){
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter value of N : ");
        n = sc.nextInt();
        int ans = 1;
        for(int i = 1; i<=n; i++){
            ans = ans*i;
        }
        System.out.println(ans);
    }
}
