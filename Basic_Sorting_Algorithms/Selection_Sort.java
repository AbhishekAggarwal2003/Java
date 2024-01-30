package Basic_Sorting_Algorithms;


//Pick the smallest element from the array and put it at 0 index and increase the index by 1 and repeat

public class Selection_Sort {
    public static void selectionsort(int array[]){
        for(int i=0;i<array.length-1;i++){
            int minPos=i;
            for(int j=i+1;j<array.length;j++){
                if(array[minPos]>array[j]){
                    minPos=j;                
                }
            }
            //swap
            int temp=array[minPos];
            array[minPos]=array[i];
            array[i]=temp;
        }
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
        selectionsort(array);
        printarray(array);
    }
}
