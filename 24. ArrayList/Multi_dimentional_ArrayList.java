// Multi-dimnetional ArrayList
import java.util.Scanner;
import java.util.ArrayList;
public class Multi_dimentional_ArrayList {
    public static void main(String args[]){
        ArrayList<ArrayList<Integer>> mainList = new ArrayList<>();

        ArrayList<Integer> list1 = new ArrayList<>();
        ArrayList<Integer> list2 = new ArrayList<>();
        ArrayList<Integer> list3 = new ArrayList<>();

        mainList.add(list1);
        mainList.add(list2);
        mainList.add(list3);

        Scanner sc = new Scanner(System.in);
        for(int i = 0; i<3; i++){
            ArrayList<Integer> currList = mainList.get(i);
            for(int j = 0; j<3; j++){
                int x = sc.nextInt();
                currList.add(x);
            }
            //System.out.println();
        }

        System.out.println(mainList);
    }
}
