package Arrays_Part2;

public class Max_SubArray_Sum_PrefixSum {
    
    public static void maxsubarraysum(int array[]){
        int max_sum=Integer.MIN_VALUE;
        int prefix[]=new int[array.length];
        prefix[0]=array[0];
        for(int i=1;i<prefix.length;i++){
            prefix[i]=prefix[i-1]+array[i];
        }
        //  i==start    j==end
        for(int i=0;i<array.length;i++){
            for(int j=i;j<array.length;j++){
                int sum = i==0? prefix[j] : prefix[j]-prefix[i-1]; //ternary operator
                if(sum>max_sum){
                    max_sum=sum;
                }
            }
        }
        System.out.println("Maximum Sum: "+max_sum);
    }
    
    public static void main(String[] args) {
        int array[]={2,4,6,8,10,12,14};
        maxsubarraysum(array);
    }
}
