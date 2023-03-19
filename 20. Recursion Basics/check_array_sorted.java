// check array is sorted or not usng recursion

public class check_array_sorted {
    public static boolean isSorted(int arr[], int i){
        if(i==arr.length-1){
            return true;
        }
        if(arr[i]>arr[i+1]){
            return false;
        }
        return isSorted(arr, i+1);
    }
    public static void main(String args[]){
        int arr[] = {1,2,3,3,4,5,6,7};
        System.out.println(isSorted(arr, 0));
    }
}
