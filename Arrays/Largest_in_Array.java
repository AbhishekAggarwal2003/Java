package Arrays;

public class Largest_in_Array {
    public static int largest(int array[]){
        int largest=Integer.MIN_VALUE;
        int smallest=Integer.MAX_VALUE;
        for(int i=0;i<array.length;i++){
            if (array[i]>largest){
                largest=array[i];
            }
            if (array[i]<smallest){
                smallest=array[i];
            }
        }
        System.out.println("Smallest Value is: "+smallest );
        return largest;
        
    }
    
    public static void main(String[] args) {
        int array[]={4,5,78,76,4,3,23,45,-45};
        int largest=largest(array);
        System.out.println("largest value is: "+largest);
    }
}
