public class array_as_arguments {
    public static void update(int arr[]){
        for(int  i = 0; i<arr.length; i++){
            arr[i]++;
        }
    }
    public static void main(String args[]){
        int marks[] = {97,98,99};
        
        update(marks);
        for(int i = 0; i<marks.length; i++){
            System.out.print(marks[i]+" ");
        }
        System.out.println();
    }
}
