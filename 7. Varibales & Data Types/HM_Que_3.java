// taking 3 item pen pencil & erasor then print cost with 18% gst
import java.util.*;
public class HM_Que_3 {
    public static void main(String args[]){
        // float pen, pencil, erasor;
        // Scanner sc = new Scanner(System.in);
        // System.out.println("Enter value of pen : ");
        // pen = sc.nextFloat();
        // System.out.println("Enter value of pencil : ");
        // pencil = sc.nextFloat();
        // System.out.println("Enter value of erasor : ");
        // erasor = sc.nextFloat();

        // float total = pen + pencil + erasor;
        // System.out.println("Total cost of e items are : " + total);
        // System.out.println("Total cost of item with 18% GST is : " + (total + (total/100)*18));
        
        float pen = 10, pencil = 5, erasor=5.5f;
        int a,b,c;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of pen : ");
        a = sc.nextInt();
        System.out.println("Enter number of pencil : ");
        b = sc.nextInt();
        System.out.println("Enter number of erasor : ");
        c = sc.nextInt();

        float total = a*pen + b*pencil + c* erasor;
        System.out.println("Total cost of e items are : " + total);
        System.out.println("Total cost of item with 18% GST is : " + (total + (total/100)*18));
    }
}
