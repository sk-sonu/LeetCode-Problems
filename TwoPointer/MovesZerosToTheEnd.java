public class MovesZerosToTheEnd{
    static void displayArray(int arr[]){
        for(int i = 0; i<arr.length;i++){
        System.out.print(arr[i]+" ");
    }
    System.out.println();
    }
public static void main(String[] args) {
    // int nums[] ={0,1,0,3,12};
    int nums[] ={2,0,3,5,0,10,12};
    int n = nums.length;
    int left = 0; 
    int right = 0;
    int temp;
    System.out.println("*******Before Operation********");
    displayArray(nums);
    while(right<n){
        if(nums[right] != 0 && nums[left] != 0){
            left++;
            right++;
        }
        else if(nums[right] == 0 && nums[left] == 0){
            right++;
        }
        else if(nums[right]!=0 && nums[left] == 0){
            temp = nums[right];
            nums[right] = nums[left];
            nums[left] = temp;
            right++;
            left++;
        }
    }
    System.out.println("*******AFter Operation********");
    displayArray(nums);
}
}