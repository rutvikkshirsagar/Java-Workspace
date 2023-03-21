// Reverse an ArrayList

import java.util.ArrayList;
public class print_Reverse {
    // swaping two values
    public static void swap(ArrayList<Integer> arr, int s, int e){
        Integer temp = arr.get(s);
        arr.set(s,arr.get(e));
        arr.set(e,temp);
    }
    public static void main(String args[]){
        ArrayList<Integer> list = new ArrayList<>();
        list.add(2);
        list.add(5);
        list.add(9);
        list.add(3);
        list.add(6);

        // reverse ArrayList
        for(int i = list.size()-1; i>=0; i--){
            System.out.print(list.get(i)+" ");
        }
        System.out.println();

        // Finding maximum element
        int max = Integer.MIN_VALUE;
        for(int i = 0; i<list.size()-1; i++){
            // if(list.get(i)>max){
            //     max = list.get(i);
            // }
            max = Math.max(max, list.get(i));
        }
        System.out.println("Maximum element in ArrayList is "+ max+".");


        // swaping two elements
        System.out.println(list);
        swap(list, 1, 3);
        System.out.println(list);

    }
}
