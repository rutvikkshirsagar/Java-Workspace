// Binary String Problem
// Print all binary strings of size N without consecutive ones.

import java.util.*;
public class binary_string_problem {
    // this que of check valid string of there is no consecutive ones.
    // public static void binaryString(String str, int i){
    //     //base case
    //     if(i == str.length()){
    //         System.out.println(str+" is valid String!!!");
    //         return;
    //     }
    //     //kamm
    //     if(str.charAt(i-1) == '1' && str.charAt(i)=='1'){
    //         System.out.print("Invalid String!!");
    //         return;
    //     }
    //     binaryString(str, i+1);
    // }
    public static void printBinString(int n, int lastplace, String str){
        // base case
        if(n==0){
            System.out.println(str);
            return;
        }
        //kamm
        // if(lastplace == 0){
        //     printBinString(n-1, 0, str+"0");
        //     printBinString(n-1, 1, str+"1");
            
        // }
        // else{
        //     printBinString(n-1, 0, str+"0");
        // }

        printBinString(n-1, 0, str+"0");
        if(lastplace==0){
            printBinString(n-1, 1, str+"1");
        }
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a value of n : ");
        int n = sc.nextInt();
        printBinString(n, 0,"");
    }
}
