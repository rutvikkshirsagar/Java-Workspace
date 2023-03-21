// Find the maximum water trapped by container
import java.util.ArrayList;
public class container_with_most_water {
    public static int mostWaterContainer(ArrayList<Integer> arr){
        // brute force approach
        int maxArea = Integer.MIN_VALUE;
        int ans = 0;
        for(int i = 0; i<arr.size()-1; i++){
            for(int j = i+1; j<arr.size(); j++){
                int min = Math.min(arr.get(i),arr.get(j));
                ans = min * (j-i);
                maxArea = Math.max(ans, maxArea);
            }
            
        }
        return maxArea;
    }

    // Optimised Approach
    public static int maximumWater(ArrayList<Integer> arr){
        int ptr1 = 0;
        int ptr2 = arr.size()-1;
        int maxWater = Integer.MIN_VALUE;
        while(ptr1<ptr2){
            int ans = Integer.MIN_VALUE;
            if(ptr2>ptr1){
                ptr1++;
            }
            else{
                ptr2--;
            }
            ans = (Math.min(arr.get(ptr1),arr.get(ptr2))) * (ptr2-ptr1);
            maxWater = Math.max(ans,maxWater);
        }
        return maxWater;
    }
    public static void main(String args[]){
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(8);
        list.add(6);
        list.add(2);
        list.add(5);
        list.add(4);
        list.add(8);
        list.add(3);
        list.add(7);

        System.out.println("Maximum water in container is "+mostWaterContainer(list)+".");
        System.out.println("Maximum water in container is "+maximumWater(list)+".");
    }
}
