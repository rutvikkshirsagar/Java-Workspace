public class linear_search{

    public static void main(String args[]){
        int arr[] = {1,2,3,4,5,6,7,8,9,10};

        int key = 10;

        for(int i = 0; i<arr.length; i++){
            if(arr[i] == key){
                System.out.print(i);
                break;
            }
        }
    }
}