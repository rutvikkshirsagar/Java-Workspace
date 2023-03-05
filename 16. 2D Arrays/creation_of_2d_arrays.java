// Creation of 2D array 
import java.util.*;
public class creation_of_2d_arrays {
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
        // printing 2d array
        System.out.println("Your entered array is follow : ");
        for(int i = 0; i<matrix.length; i++){
            for(int j = 0; j<matrix[0].length; j++){
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
    }
}
