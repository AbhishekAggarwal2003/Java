package Arrays;

public class Reverse_Array {
    public static void reverse(int array[]){
        int start=0;
        int end=array.length-1;
        while(start!=end){
            int temp=array[end];
            array[end]=array[start];
            array[start]=temp;
            start++;
            end--;
        }
    }
    
    public static void main(String[] args) {
        int array[]={1,2,3,4,6,8,10,23,35,67,89};
        reverse(array);
        for(int i=0;i<array.length;i++){
            System.out.print(array[i]+" ");
        }
    }
}
