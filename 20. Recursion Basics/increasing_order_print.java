// Print number in increasing order using recursion

public class increasing_order_print{

    public static void main(String args[]){
        increaseOrd(10);
    }

    public static void increaseOrd(int n){
        if(n==0){
            return;
        }
        increaseOrd(n-1);
        System.out.print(n+" ");
    }
}

