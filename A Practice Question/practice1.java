// Write a program to output the smallest positive integer not present in the input list or array.

// E.g.: 1) For input list [1, 0, 3] output should be 2.
// 2) For input array [1, 2, 3, 4] output should be 5.
// 3) For  input [-2, -3, 0] output should be 1.

import java.util.*;
public class practice1 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of element in array : ");
        int n = sc.nextInt();

        int arr[] = new int[n];
        System.out.print("Enter "+ n+" elements : ");
        for(int i = 0; i<n; i++){
            arr[i] = sc.nextInt();
        }

        Arrays.sort(arr);
        int count = 1;
        int i = 0;
        while(i<n){
            if(count==arr[i]){
                count++;
            }
            else if(count<arr[i]){
                if(arr[i]>1){
                    break;
                }
            }
            i++;
        }
        System.out.println("Smallest positive value in given array is "+count+".");
        
    }
}
