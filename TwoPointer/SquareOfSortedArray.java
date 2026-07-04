public class SquareOfSortedArray {
    static int[] sortedArray(int[] nums){
        int n = nums.length;
        int[] dummy = new int[n];
        int left=0;
        int right=n-1;
        int leftSquare;
        int rightSquare;
        int index = n-1;

        while(left<=right){
            leftSquare = nums[left] * nums[left];
            rightSquare = nums[right] * nums[right];
            if(leftSquare>=rightSquare){
                dummy[index] = leftSquare;
                left++;
                index--;
            }
            else{
                dummy[index] = rightSquare;
                right--;
                index--;
            }
        }
        return dummy;
    } 
    public static void main(String[] args){
        int testCase1[] = {-4,-1,0,3,10};
        int testCase2[] = {-7,-3,2,3,11};
        int result1[] = sortedArray(testCase1);
        int result2[] = sortedArray(testCase2);
        System.out.println("For TestCase1: ");
        for(int i = 0; i<result1.length;i++)
        {
            System.out.print(result1[i]+" ");
        }
        System.out.println();
        System.out.println("For TestCase2: ");
        for(int i = 0; i<result2.length;i++)
        {
            System.out.print(result2[i]+" ");
        }
    }
}
