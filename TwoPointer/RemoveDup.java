public class RemoveDup {
     static int removeDuplicates(int[] nums) {
        int n = nums.length;
        int j = 1;
        int k = 1;
        for(int i = 0; i<n-1; i++){
            if(nums[i] != nums[j] && j<n)
            {
                nums[k] = nums[j];
                k++;
                j++;
            }
            else if(nums[i] == nums[j] && j<n){
                j++;
            }
        }
        return k ;
    }
    public static void main(String[] args){
        int nums1[] = {0,0,1,1,1,2,2,3,3,4};
        int nums2[] = {1,1,2};
        int k1 = removeDuplicates(nums1);
        int k2 = removeDuplicates(nums2);
        System.out.println(k1);
        System.out.println(k2);
    }
}
