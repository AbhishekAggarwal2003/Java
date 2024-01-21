package Arrays_Part2;

public class Max_SubArray_Sum_BruteForce {
    public static void maxsubarraysum(int array[]){
        int max_sum=0;
        for(int i=0;i<array.length;i++){
            for(int j=i;j<array.length;j++){
                int sum=0;
                for(int k=i;k<=j;k++){
                    sum=sum+array[k];
                }
                if(sum>max_sum){
                    max_sum=sum;
                }
            }
        }
        System.out.println(max_sum);
    }
    
    public static void main(String[] args) {
        int array[]={2,4,6,8,10,12,14};
        maxsubarraysum(array);
    }
}
