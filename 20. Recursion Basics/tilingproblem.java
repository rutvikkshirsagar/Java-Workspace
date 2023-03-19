// Solving Tiling Problem
// Given a 2 * n board  and tiles of size "2 * 1", count number of ways to tile the given board using 2 * 1 tiles.
// (A tile can either be placed horizontally or vertically).
import java.util.*;
public class tilingproblem {
    public static int tilePrb(int n){
        // base case
        if(n==1 || n== 0){
            return 1;
        }
        int vertical = tilePrb(n-1);
        int horizontal = tilePrb(n-2);

        return vertical + horizontal;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter value of n of floor :" );
        int n = sc.nextInt();
        System.out.println(tilePrb(n));
    }
}
