package Arrays;

public class Pairs_Array {
    public static void pair(int array[]){
        //int j=0;
        for(int i=0;i<array.length;i++){
            for(int j=i+1;j<array.length;j++){
                System.out.print("("+array[i]+","+array[j]+") ");
            }
            System.out.println();
        }
    }
    
    public static void main(String[] args) {
        int array[]={2,4,6,8,10,12,14};
        pair(array);
    }
}
