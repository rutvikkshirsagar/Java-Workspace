import java.util.*;
public class HW_Que_1 {
    public static void main(String args[]){
        int a,b,c;

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter three numbers : ");
        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();

        System.out.println("Average of given three numbers are :" + (float)(a+b+c)/3);

    }
}
