// printing greatest sub-array sum in O(n) time comp

import java.util.*;
public class kadanes {
    public static int kadane(int arr[]){
        int gs = Integer.MIN_VALUE;
        int cs = 0;
        for(int i = 0; i<arr.length; i++){
            cs = cs + arr[i];
            if(cs<0){
                cs = 0;
            }
            gs = Math.max(gs, cs);
        }
        return gs;
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
        System.out.println("Greatest sum of sub-array is: "+kadane(arr));
    }
}
