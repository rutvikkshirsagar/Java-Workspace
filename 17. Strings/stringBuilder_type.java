public class stringBuilder_type {
    public static void main(String args[]){
        StringBuilder sb = new StringBuilder("");

        sb.append('a'); // appden letter sb+='a'

        System.out.println(sb);

        // convert StringBuilder to String
        
        sb.toString();

        System.out.println(sb);

        String ans = sb.toString();

        // checking is it string

        System.out.print(ans instanceof String);

    }
}
