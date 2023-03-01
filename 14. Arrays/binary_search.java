import java.util.*;

public class binary_search {

    public static int bin_Search(int arr[], int key){
        int ans = -1;
        int s = 0;
        int e = arr.length-1;
        while(s<=e){
            int mid = (s+e)/2;
            if(arr[mid] == key){
                ans = mid;
                break;
            }// 8>5
            else if(arr[mid]<key){
                s = mid+1;
            }
            else{
                e = mid-1;
            }
        }
        return ans;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of element in array :\n");
        int n = sc.nextInt();

        int arr[] = new int[n];
        System.out.print("Enter "+ n+" elements : ");
        for(int i = 0; i<n; i++){
            arr[i] = sc.nextInt();
        }

        System.out.print("Enter value to search in array : ");
        int key = sc.nextInt();

        int ans = bin_Search(arr,key);

        if(ans==-1){
            System.out.print("Element is not found!");
        }
        else{
            System.out.print(key+" is found!");
        }
    }
}
