import java.util.*;
import java.util.Collections;

public class sorting_ArrayList {
    public static void main(String args[]){
        ArrayList<Integer> list = new ArrayList<>();

        list.add(5);
        list.add(4);
        list.add(2);
        list.add(3);
        list.add(1);

        // Sorting in acending order using fuction
        System.out.println(list);

        Collections.sort(list); 

        System.out.println(list);

        // Sorting in decending order using fuction

        Collections.sort(list, Collections.reverseOrder()); 

        System.out.println(list);
    }
}
