// Find any pair in the sorted & Rotated ArrayList has a target sum.
import java.util.ArrayList;
import java.util.Scanner;
public class pair_sum_advanced {
    public static boolean rotated_Array_pair_sum(ArrayList<Integer> list, int Target){
        int pivot = -1;
        int n = list.size();
        for(int i = 0; i<list.size()-1; i++){
            if(list.get(i)<list.get(i+1)){
                pivot = i;
            }
        }
        int sp = pivot+1;
        int ep = pivot;
        
        while(sp!=ep){
            if((list.get(sp)+list.get(ep))==Target){
                return true;
            }
            if((list.get(sp)+list.get(ep))<Target){
                sp = (sp+1)%n;
            }
            else{
                ep = (ep-1)%n;
            }
        }
        return false;
    }
    public static void main(String args[]){
        ArrayList<Integer> list = new ArrayList<>();
        list.add(11);
        list.add(15);
        list.add(6);
        list.add(8);
        list.add(9);
        list.add(10);
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Target : ");
        int target = sc.nextInt();
        System.out.print("Target sum avaliable is "+rotated_Array_pair_sum(list, target)+".");
    }
}
