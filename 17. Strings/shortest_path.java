// Given a route conataning 4 directions (E, W, N, S), find the shortest path of route distination.

public class shortest_path {
    public static int shortestPath(String path){
        int displacement = 0;
        int x = 0, y = 0;
        for(int i = 0; i<path.length(); i++){
            if(path.charAt(i)=='E'){
                x++;
            }
            else if(path.charAt(i)=='W'){
                x--;
            }
            else if(path.charAt(i)=='N'){
                y++;
            }
            else{
                y--;
            }
        }

        displacement = (int)Math.sqrt((x*x)+(y*y));
        return displacement;
    }
    public static void main(String args[]){
        String path = "WNEENESENNN";
        System.out.println("Shortest distance betn destination & start is "+ shortestPath(path)+".");

    }
}
