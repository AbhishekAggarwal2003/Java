package Basic_Sorting_Algorithms;

public class Bubble_Sort {

    public static void sort(int array[]){
        int n=array.length;
        for(int turn=0;turn<=n-2;turn++){
            for(int j=0;j<=n-2-turn;j++){
                if(array[j]>array[j+1]){
                    int temp=array[j+1];
                    array[j+1]=array[j];
                    array[j]=temp;
                }
            }
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
        int array[]={2,1,6,4,8,6,9,4};
        sort(array);
        printarray(array);
    }
}
