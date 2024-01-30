package Basic_Sorting_Algorithms;

//Pick an element(from unsorted array) and place it in right pos in sorted array

public class Insertion_Sort {
    public static void insertionsort(int array[]){
        
    }
    
    public static void printarray(int array[]){
        int n=array.length;
        for(int i=0;i<n-1;i++){
            System.out.print(array[i]+" ");
        }
        System.out.println();
    }
    
    public static void main(String[] args) {
        int array[]={2,5,9,3,2,5,8,0,5};
        insertionsort(array);
        printarray(array);
    }
}
