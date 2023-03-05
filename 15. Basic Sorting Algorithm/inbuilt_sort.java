// import java.util.Arrays;
// import java.util.*;
// public class inbuilt_sort {
//     public static void main(String args[]){
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter size of array : ");
//         int n = sc.nextInt();
//         int arr[] = new int[n];
//         System.out.print("Enter elements of array : ");
//         for(int i = 0; i<n; i++){
//             arr[i] = sc.nextInt();
//         }
//         Arrays.sort(arr);
//         for(int i = 0; i<arr.length; i++){
//             System.out.print(arr[i]+"");
//         }
//     }
// }

//----------------------------------------------

// sort in reverse order

import java.util.Collections;
import java.util.Arrays;
public class inbuilt_sort {
        public static void main(String args[]){
            Integer arr[] = {1, 5, 3, 4, 2};

            // sort in range from index 0 to 2
            Arrays.sort(arr, 0, 3, Collections.reverseOrder());

            for(int i = 0; i<arr.length; i++){
                System.out.print(arr[i]+" ");
            }
            System.out.println();

            Arrays.sort(arr,Collections.reverseOrder());

            for(int i = 0; i<arr.length; i++){
                System.out.print(arr[i]+" ");
            }
        }
    }
