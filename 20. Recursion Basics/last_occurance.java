// Write a Fuction to find last occurance of element in an array

import java.util.*;

import javax.swing.text.html.StyleSheet;
public class last_occurance {
    static int maxidx = -1;
    public static int Last_occur(int arr[], int i, int key){
        //base case
        if(i == arr.length){
            return maxidx;
        }
        if(arr[i] == key){
            maxidx = Math.max(maxidx, i);
        }
        return Last_occur(arr,i+1,key);
    }

    public static int Last_occur1(int arr[], int i, int key){
        // base case
        if(i==arr.length-1){
            return -1;
        }
        int lo = Last_occur1(arr,i+1,key);
        if(arr[i] == key && lo == -1){
            return i;
        }
        return lo;
    }

    public static void main(String args[]){
        int arr[] = {1,2,2,3,3,4,4,5,5,6};

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a key to search : ");
        int key = sc.nextInt();

        System.out.println("Element first occurance found at "+Last_occur(arr,0,key)+".");
        System.out.println("Element first occurance found at "+Last_occur1(arr,0,key)+".");
    }
}
