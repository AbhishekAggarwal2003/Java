package Arrays_Part2;

/*There is an integer array nums sorted in ascending order (with distinct values).
Prior to being passed to your function, nums is possibly rotated at an unknown pivot index k (1 <= k < nums.length) such  
that the resulting array is [nums[k], nums[k+1], ..., nums[n-1], nums[0], nums[1], ..., nums[k-1]] (0-indexed).   
For example, [0,1,2,4,5,6,7] might be rotated at pivot index 3 and become [4,5,6,7,0,1,2].
Given the array nums after the possible rotation and an integer target, return the index of target if it is in nums, or -1 if it is not in nums.
You must write an algorithm with O(log n) runtime complexity.*/

public class Q2 {
    public static int Search(int array[],int key){
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
        System.out.println("Index: "+Search(array, key));
    }

}
