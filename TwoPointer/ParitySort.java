public class ParitySort {
    static int[] sortByParity(int[] nums){
        int temp = 0;
        int n = nums.length;
        int j = n-1;
        int i = 0;
        while(i<j){
            if(nums[j]%2 !=0)
            {
                j--;
            }
            else if(nums[i] %2 == 0){
                i++;
            }
            else{
                temp = nums[j];
                nums[j] = nums[i];
                nums[i] = temp;
            }
        }
        return nums;
    }
    public static void main(String[] args){
        int testCase1[] = {3,1,2,4};
        int result[] = sortByParity(testCase1);
        for(int i =0;i<testCase1.length;i++){
            System.out.print(result[i]+" ");
            }
    }
}
