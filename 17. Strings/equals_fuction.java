// How to compare two string using fuction

public class equals_fuction {
    public static void main(String args[]){
        String s1 = "Rutvik";
        String s2 = "Rutvik";

        String s3 = new String("Rutvik");

        if(s1==s2){
            System.out.println("Equal");
        }
        else{
            System.out.println("Not Equal");
        }

        if(s1==s3){
            System.out.println("Equal");
        }
        else{
            System.out.println("Not Equal");
        }

        if(s1.equals(s3)){
            System.out.println("Equal");
        }
        else{
            System.out.println("Not Equal");
        }
    }
}
