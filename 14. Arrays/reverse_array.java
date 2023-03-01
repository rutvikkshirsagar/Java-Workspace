// how to reverse array 


import java.util.*;

public class reverse_array {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of element in array :\n");
        int n = sc.nextInt();

        int arr[] = new int[n];
        System.out.print("Enter "+ n+" elements : ");
        for(int i = 0; i<n; i++){
            arr[i] = sc.nextInt();
        }

        int new_arr[] = new int[n];
        int c = 0;
        for(int i = n-1; i>=0; i--){
            new_arr[c] = arr[i];
            c++;
        }

        int f = 0;
        int e = n-1;
        int new_while_arr[] = new int[n];
        while(f<e){
            int temp = arr[f];
            arr[f] = arr[e];
            arr[e] = temp;
            e--;
            f++;
        }

        for(int i = 0; i<n; i++){
            System.out.print(new_arr[i]+" ");
        }
        System.out.println();
        System.out.println("reverse using while : ");
        for(int i = 0; i<n; i++){
            System.out.print(arr[i]+" ");
        }
    }
}