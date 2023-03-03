import java.util.*;
public class maxSubarraySum {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of element in array : ");
        int n = sc.nextInt();

        int arr[] = new int[n];
        System.out.print("Enter "+ n+" elements : ");
        for(int i = 0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        int max_sum = 0;
        int sum = 0;
        for(int i = 0; i<n; i++){
            for(int j = i+1; j<n; j++){
                for(int k = i; k<=j; k++){
                    sum=sum + arr[k];
                }
                if(sum>max_sum){
                    max_sum = sum;
                }
                sum = 0;
            }
        }
        System.out.println(max_sum);
    }
}
