

public class function_overloading {
    public static int sum(int a, int b){
        return a+b;
        
    }
    public static int sum(int a,int b,int c){
        return a+b+c;
    }
    public static void main(String args[]){
        int a=2,b=5;int c =2;
        System.out.println(sum(a,b));
        System.out.println(sum(a,b,c));
    }
    
}
