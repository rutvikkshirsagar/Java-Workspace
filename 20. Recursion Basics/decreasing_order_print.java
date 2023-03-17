// Print number in decreasing order

import java.util.*;
public class decreasing_order_print {
    
    public static void main(String args[]){
        recursion r = new recursion();
        r.decreasing_print(20);
        int arr[] = new int[10];
    }
    
}

class recursion{
    void decreasing_print(int num){
        if(num==0){
            return;
        }
        System.out.print(num+" ");
        decreasing_print(num-1);
    }
}
