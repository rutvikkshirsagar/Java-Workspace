// Write a Fuction to find all occurance of element in an array

import java.util.*;
public class all_occurance {
    public static void all_occurances(int arr[], int i, int key){
        // base case
        if(i == arr.length){
            return;
        }
        // kamm
        if(arr[i] == key){
            System.out.print(i+" ");
        }
        all_occurances(arr, i+1, key);
    }
    public static void main(String args[]){
        int arr[] = {1,2,2,3,3,2,4,5,2,2};

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a key to search : ");
        int key = sc.nextInt();

        System.out.print("Element first occurance found at ");
        all_occurances(arr,0,key);
    }
    
}

