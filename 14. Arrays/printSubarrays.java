import java.util.*;
public class printSubarrays {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of element in array : ");
        int n = sc.nextInt();

        int arr[] = new int[n];
        System.out.print("Enter "+ n+" elements : ");
        for(int i = 0; i<n; i++){
            arr[i] = sc.nextInt();
        }

        for(int i = 0; i<n; i++){
            for(int j = i+1; j<n; j++){
                System.out.print("(");
                for(int k = i; k<=j; k++){
                    System.out.print(arr[k]+" ");
                }
                System.out.print(")");
            }
            System.out.println();
        }
    }
}
