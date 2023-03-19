// Remove duplicates from string

// not wroking becz of any reason
public class remove_duplicates {
    public static void rem_duplicate(String str,StringBuilder newStr, int i, boolean map[]){
        // base case
        if(i == str.length()){
            System.out.println(newStr);
            return;
        }

        char curr_ch = str.charAt(i);
        if(map[curr_ch-'a'] == true){
            rem_duplicate(str, newStr, i+1, map);
        }
        else{
            map[curr_ch - 'a'] = true;
            rem_duplicate(str, newStr.append(str.charAt(curr_ch)), i+1, map);

        }
    }
    public static void main(String args[]){
        String str = "rruuttvvikksshhhiirrssaaggaarr";
        rem_duplicate(str, new StringBuilder(" "), 0, new boolean[26]);
    }
}
