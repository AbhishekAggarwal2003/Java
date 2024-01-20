package Arrays;
public class LinearSearch {
    public static int linearsearch(int array[],int key){
        for(int i=0;i<array.length;i++){
            if(array[i]==key){
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int array[]={1,2,3,6,7,10,8,5,3};
        int key=101;
        int index=linearsearch(array,key);
        if (index==-1) {
            System.out.println("Key does not exist");
        }
        else{
            System.out.println("Key is at index; "+index);
        }
    }
}
