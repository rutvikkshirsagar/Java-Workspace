// Write a Fuction to find first occurance of element in an array
import java.util.*;
public class first_occurance_in_array {
    public static int occurance(int arr[], int i, int key){
        //base case
        if(i == arr.length){
            return -1;
        }
        if(arr[i] == key){
            return i;
        }
        return occurance(arr,i+1,key);
    }
    public static void main(String args[]){
        int arr[] = {1,2,2,3,3,4,4,5,5,6};

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a key to search : ");
        int key = sc.nextInt();

        System.out.println("Element first occurance found at "+occurance(arr,0,key)+".");
    }
}
