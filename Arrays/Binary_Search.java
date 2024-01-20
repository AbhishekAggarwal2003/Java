package Arrays;
public class Binary_Search {
    public static int BinarySearch(int array[],int key){
        int start=0;
        int end=array.length-1;
        while (start<=end){
            int mid=(start+end)/2;
            if(array[mid]<key){
                start=mid+1;
            }
            if(array[mid]>key){
                end=mid-1;
            }   
            if(array[mid]==key){
                return mid;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int array[]={1,2,3,4,6,8,10,23,35,67,89};
        int key=10;
        System.out.println("Index: "+BinarySearch(array, key));
    }
}
