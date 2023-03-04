// Sorting using bubble sort
import java.util.*;
public class bubble_sort {
    public static void bubbleSort(int arr[]){
        for(int i = 0; i<arr.length; i++){
            for(int j = 0; j<arr.length-i-1; j++){
                if(arr[j]>arr[j+1]){
                    int temp = arr[j+1];
                    arr[j+1] = arr[j];
                    arr[j] = temp;
                }
            }
        }
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
        bubbleSort(arr);
        for(int i = 0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
    }
}
