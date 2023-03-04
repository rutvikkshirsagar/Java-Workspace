// max sum of subarray in On2 comp
import java.util.*;
public class preFixSum {

    public static int prefix_Max_Sum(int arr[]){
        int prefix[] = new int[arr.length];
        prefix[0] = arr[0];
        for(int i = 1; i<arr.length; i++){
            prefix[i] = prefix[i-1] + arr[i];
        }
        int max_sum = Integer.MIN_VALUE;
        int curr_sum = 0;
        for(int i = 0; i<arr.length; i++){
            int start = i;
            for(int j = i+1; j<arr.length; j++){
                int end = j;
                curr_sum = start==0 ? prefix[end] : prefix[end] - prefix[start-1];
                if(curr_sum>max_sum){
                    max_sum = curr_sum;
                }
            }
        }
        return max_sum;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of array : ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.print("Enter elements of array : ");
        for(int i = 0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        
        System.out.println("Maximum sum of subarray is : "+prefix_Max_Sum(arr));
    }
}
