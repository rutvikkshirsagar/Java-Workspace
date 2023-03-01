public class zero_one_triangle {
    public static void main(String args[]){
        int n = 5;
        for(int i = 1; i<=n; i++){
            int ind = (i%2==0)?0:1;
            for(int j = 1; j<=i; j++){
                System.out.print(ind+" ");
                if(ind==1){
                    ind--;
                }
                else{
                    ind++;
                }
            }
            System.out.println();
        }
    }
}
