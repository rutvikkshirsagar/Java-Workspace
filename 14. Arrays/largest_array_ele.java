import java.util.*;
public class largest_array_ele {

    public static int largest(int arr[]){ //10 20 30 40 50
        int ans = 0;                      //0  1  2  3  4  5
        for(int i = 0; i<arr.length; i++){
            if(arr[i]>ans){
                ans = arr[i];
            }
        }
        return ans;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of element : ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i = 0; i<n; i++){
            arr[i] = sc.nextInt();
        }

        int lar = largest(arr);
        System.out.println("Largest element in array is "+lar+".");

    }
}
