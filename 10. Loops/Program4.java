package Loops;

public class Program4 {
    public static void main(String args[]){

        // print reverse of a number

        int n = 123456789;
        int new_num=0;
        while(n!=0){
            int temp = n%10;
            new_num = new_num*10+temp;
            n/=10;
        }
        System.out.println(new_num);
    }
}
