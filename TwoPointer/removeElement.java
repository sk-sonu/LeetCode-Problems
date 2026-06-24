public class removeElement {
   public static int RemoveElement(int nums[], int val){
        int lowerBound = 0; 
        int upperBound = nums.length-1;
        while(lowerBound<=upperBound)
        {
            if(nums[lowerBound] == val){
                nums[lowerBound] = nums[upperBound];
                upperBound--;
            }
            else{
                lowerBound++;
            }
        }
        return lowerBound;
    }
    public static void main(String[] args) {
        int arr[] = {0,1,2,2,3,0,4,2};
        int k = RemoveElement(arr, 2);
        System.out.println(k);
    }
}