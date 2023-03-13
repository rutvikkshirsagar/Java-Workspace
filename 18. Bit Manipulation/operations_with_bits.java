// Operations with bits (get bit, set bit, clear bit)
public class operations_with_bits {
    public static int getIthBit(int n, int i){
        if((n & (1<<i))==0){
            return 0;
        }
        else{
            return 1;
        }
    }
    
    public static int setIthBit(int n, int i ){
        return n | (1<<i);
    }
    public static int clearIthBit(int n, int i){
        return n & (~(1<<i));
    }
    // upadate ith bit with given bit
    public static int updateIthBit(int n, int i, int b){
        if(b==1){
            return setIthBit(n, i);
        }
        else{
            return clearIthBit(n, i);
        }
    }
    public static void main(String args[]){
        System.out.println(getIthBit(10, 3));
        System.out.println(setIthBit(10, 2));
        System.out.println(clearIthBit(10, 1));
        System.out.println(updateIthBit(10, 2, 1));
    }
}
