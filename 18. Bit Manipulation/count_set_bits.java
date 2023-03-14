// Count Number of bits in Given Number
import java.util.*;
public class count_set_bits{
    public static int countSetBit(int n){
        int count = 0;
        while(n>0){
            if((n&1) == 1){
                count++;
            }
            n = n>>1;
        }
        return count;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Number : ");
        int n = sc.nextInt();

        System.out.println("Number of set bits in "+ n+" is "+countSetBit(n)+".");
    }
}