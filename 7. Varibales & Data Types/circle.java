import java.util.*;

public class circle {
    public static void main(String args[]){

        System.out.println("Enter a Radius :");

        Scanner sc = new Scanner(System.in);

        int r = sc.nextInt();

        System.out.println("Area of Circle having radius "+ r + " is " + 3.14*r*r);
    }
}
