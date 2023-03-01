import java.util.*;

public class largest_of_two_no {
    public static void main(String args[]){

        // largest of two number
        int n1,n2;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter value of n1 & n2 : ");
        n1 = sc.nextInt();
        n2 = sc.nextInt();

        if(n1>n2){
            System.out.println(n1 + " is greater than "+ n2);
        }
        else{
            System.out.println(n2 + " is greater than " + n1);
        }

    }
}
