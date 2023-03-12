// Find substrings in given range of index (start, end(exclusive))
import java.util.*;
public class subString {
    public static String substring(String s, int str, int end){
        String ans = "";
        for(int i = str; i<end; i++){
            ans+=s.charAt(i);
        }
        return ans;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a String : ");
        String s = sc.nextLine();
        System.out.println("Enter a starting and ending index : ");
        int str = sc.nextInt();
        int end = sc.nextInt();

        System.out.println("Substring is "+substring(s, str, end));
    }
}
