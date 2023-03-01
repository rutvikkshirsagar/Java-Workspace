import java.util.*;

public class else_if {
    public static void main(String args[]){
        int income,tax;
        System.out.println("Enter your income : ");
        Scanner sc = new Scanner(System.in);
        income = sc.nextInt();

        if(income <= 500000){
            tax = 0;
        }
        else if(income>500000 && income<=1000000){
            tax = 20;
        }
        else{
            tax = 30;
        }
        System.out.println("Your tax is "+ tax + " %.");
    }
}
