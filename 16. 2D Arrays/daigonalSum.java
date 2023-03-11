// Diagonal Sum of matrix optimised & non-optimised approach

import java.util.*;

import javax.tools.Diagnostic;
public class daigonalSum {      //O(n^2)
    public static int digonal_Sum(int arr[][]){
        int sum = 0;
        for(int i = 0; i<arr.length; i++){
            for(int j = 0; j<arr[0].length; j++){
                if(i==j){
                    sum+=arr[i][j];
                }
                else if(i+j==(arr.length-1)){
                    sum+=arr[i][j];
                }
            }
        }
        return sum;
    }

    public static int Optimised_diagonal_sum(int matrix[][]){
        int sum = 0;

        for(int i = 0; i<matrix.length; i++){
            sum+=matrix[i][i];
            sum+=matrix[i][matrix.length-i-1];
        }
        return sum;
    }

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter value of rows : ");
        int rows = sc.nextInt();
        System.out.print("Enter value of colums : ");
        int cols = sc.nextInt();

        int matrix[][] = new int[rows][cols];

        // taking 2d array input
        System.out.print("Enter "+rows+"*"+cols+" elements : ");
        for(int i = 0; i<matrix.length; i++){
            for(int j = 0; j<matrix[0].length; j++){
                matrix[i][j] = sc.nextInt();
            }
        }
        int non_opt_sum = digonal_Sum(matrix);
        int opt_sum = Optimised_diagonal_sum(matrix);
        System.out.println("The non optimised sum of diagonal is "+non_opt_sum+"\nThe optimised sum of diagonal is "+opt_sum+".");
    }
}
