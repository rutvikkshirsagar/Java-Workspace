import java.util.*;
public class create_function {

    public static int addition(int a, int b){
        return a+b;
    }

    public static void printHello(){
        System.out.println("Hello World");
    }

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int a,b;
        System.out.println("Enter two numbers : ");
        a = sc.nextInt();
        b = sc.nextInt();

        int sum = addition(a, b);

        System.out.println("Addition on two numbers are "+ sum);
    }    
}
