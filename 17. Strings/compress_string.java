// Compress the string ex. aaabbccccdd -> a3b2c4d2 ex. aabc -> a2bc
import java.util.*;

public class compress_string {
    public static String compressString(String str){
        StringBuilder sd = new StringBuilder(" ");
        Integer count = 1;
        for(int i = 0; i<str.length(); i++){
            while(i<str.length()-1 && str.charAt(i) == str.charAt(i+1)){
                count++;
                i++;
            }
            sd.append(str.charAt(i));
            if(count>1){
                sd.append(count.toString());
                count = 1;
            }
        }
        return sd.toString();
    }
    public static void main(String args[]){
        System.out.print("Enter a String to Compress : ");
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        System.out.print("Your compressed string is "+compressString(str)+".");

    }
}
