public class SortColor {

/*
The difficulty level of the question is medium...  but it is very easy to solve...
here red denotes 0, white denotes 1, and blue denotes 2,  and you have to sort the array.. 
actual magic is .. if you try to solve this with two pointer technique or applying any sorting 
then the difficulty level may be increase.. but the logic is that.. here mentioned that only 0,1,2 present in the array.. so you can solve this with another technique ..
first you count the number's occurence in the array. and then overwrite the array according to counting number.. simple... 
suppose number of 0's are 2.. so first we will fill two '0' in the array.. and similarly fill 1 and 2.. 
*/
    static void sortColors(int[] nums) {
        int red = 0;
        int blue = 0; 
        int white = 0;
        int k = 0;
        for(int i = 0 ; i<nums.length; i++){
            if(nums[i]==0){
                red++; // count 0--->>> red
            }
            else if(nums[i] == 1){
                white++; // count 1 --->>> white
            }
            else if(nums[i] == 2){
                blue++; // count 2 --->>> blue
            }
        }
            for(int i =0; i<red; i++){
                nums[k] =0; // fill  red 
                k++;
            }

               for(int i =0; i<white; i++){
                nums[k] =1; // fill white
                k++;
               }
                  for(int i =0; i<blue; i++){
                nums[k] =2; // fill  blue
                k++;
                    }
        }
    public static void main(String[] args) {
        int array[]= {0,2,1,0,1,2};
        sortColors(array);
        for(int i = 0; i<array.length; i++){
            System.out.print(array[i]+" ");

        }
        System.out.println();
    }
}
