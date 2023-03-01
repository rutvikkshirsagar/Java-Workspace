package Loops;

import java.util.*;
public class Program5 {
    public static void main(String args[]){
    // check number is prime or not!
    int n;
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter number to check prime or not : ");
    n = sc.nextInt();
    int i;
    if(n<2){
        System.out.println(n+" is not prime number.");
    }
    else{
        for(i = 2; i<n; i++){
            if(n%i==0){
                System.out.println(n+" is not prime number.");
                break;
            }
        }
        if(i==n){
            System.out.println(n+" is prime number.");
        }
        
    }

    }
}
