import java.util.*;

public class Array_creation{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        int arr[] = new int[10];

        arr[0] = sc.nextInt();
        arr[1] = sc.nextInt();
        arr[2] = 3;

        for(int i = 0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }

    }
}