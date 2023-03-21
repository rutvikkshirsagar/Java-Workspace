// I can't understand error please help me to know error

// Question
// There are 15 substrings of "abcab" : a, ab, abc, abca, abcab, b, bc, bca, bcab, c, ca, cab, a, ab, b
// Out of the above substrings, there are 7 substrings :a, abca, b, bcab, c, a and b. So, only 7
// contiguous substrings start and end with the same character.

import java.util.*;

public class contiguous_substring {
    public static int countSubstrs(String str, int i, int j, int n){
        if(n == 1){
            return 1;
        }
        if(n<=0){
            return0;
        }
        int res = countSubstrs(str,i+1,j,n-1) + countSubstrs(str,i,j-1,n-1) - countSubstrs(str,i+1,j-1,n-2);
        if(str.charAt(i) ==str.charAt(j)){
            res+1;
        }
    }

    public static void main(String args[]) {
        countSubstrs("abcde", 0, 0, 5);
    }
}