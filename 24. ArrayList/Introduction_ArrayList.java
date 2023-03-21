import java.util.ArrayList;

public class Introduction_ArrayList{
    // public static boolean check_number(Integer ArrayList, int key){
    //     for(int i = 0; i<list.size(); i++){
    //         if(list.get(i) == key){
    //             return true;
    //         }
    //     }
    //     return false;
    // }
    public static void main(String args[]){
        // creation of ArrayList
        ArrayList<Integer> list = new ArrayList<>();
        ArrayList<Boolean> list1 = new ArrayList<>();
        ArrayList<String> list3 = new ArrayList<>();

        // operations on ArrayLists
        // add() fuction

        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);

        System.out.println(list);

        // get() operation
        list.get(0); // access the index but didn't print element
        System.out.println(list.get(0));
        System.out.println(list.get(1));
        System.out.println(list.get(2));

        //set(index, element) 

        list.set(0,10);  // replace element with given index
        System.out.println(list);  

        list.add(1,20);  // add(index, element) will add element on index and shift next all element by 1
        System.out.println(list);

        // remove element form arraylist
        // remove(index) function remove given index 

        list.remove(5);
        System.out.println(list);

        // size of ArrayList
        System.out.println("Size : "+list.size());

        // check element is present in ArrayList or not
        System.out.println(list.contains(2));  // gives boolean ans as Trus
        System.out.println(list.contains(1));  // gives boolean ans as False

        // print ArrayList
        for(int i = 0; i<list.size(); i++){
            System.out.print(list.get(i)+" ");
        }

    }
}