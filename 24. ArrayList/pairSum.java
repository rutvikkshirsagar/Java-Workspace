// Find any pair in sorted ArrayList has a Traget Sum.

import java.util.ArrayList;
import java.util.Scanner;

public class pairSum {
    // Brute Force Approach
    public static void pairSum(ArrayList<Integer> list, int Target){
        for(int i = 0; i<list.size()-1; i++){
            for(int j = i+1; j<list.size(); j++){
                if((list.get(i)+list.get(j))==Target){
                    System.out.print("["+list.get(i)+","+list.get(j)+"], ");
                }
            }
            
        }
    }

    // Optimised Approach O(n) [Two Pointer Approach]
    public static boolean pair_sum(ArrayList<Integer> list, int Target){
        ArrayList<Integer> ans = new ArrayList<>();
        int ptr1 = 0;
        int ptr2 = list.size()-1;

        while(ptr1<ptr2){
            if((list.get(ptr1)+list.get(ptr2))==Target){
                return true;
            }
            else if((list.get(ptr1)+list.get(ptr2))>Target){
                ptr2--;
            }
            else{
                ptr1++;
            }
        }
        return false;
    } 

    public static void main(String args[]){
        ArrayList<Integer> arr = new ArrayList<>();
        for(int i = 1; i<6; i++){
            arr.add(i);
        }
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Target : ");
        int target = sc.nextInt();
        System.out.print("Possible pairs are ");
        pairSum(arr, target);

        System.out.println();
        System.out.println(pair_sum(arr, target));
    }
}
