// Check Number is even or odd
import java.util.*;
public class check_even_odd {
    public static void checkEvenOdd(int num){
        if((num & 1) == 1){
            System.out.println(num + " is Odd!");
        }
        else{
            System.out.println(num + " is Even!");
        }
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a binary number : ");
        int input = sc.nextInt();
        checkEvenOdd(input);
    }
}
