public class ConcatinationArray{
    /*
    This  logic is very simple.. We are given an array.. the work is to take last element of the array and first element of the array.. and store those values after concatination , and remove those element from the arrary.. that means we have to update our pointer. suppose our first pointer is 'i' which is pointed to the first element of the array that means the index is '0' and another pointer is 'j' which is pointed to ther last element of the array.. suppose the array size is 5 so the index is '4' , Hence initial value of 'i' and 'j' is '0' & '4' respectively. after every concatination  you have to update both the pointer , i++(since it is at the first) j--(since it at the last) , do this operation till j>=i, and the inner condition is// 
    
    */
     public static long findTheArrayConcVal(int[] nums) {
        int i = 0; 
        int j = nums.length-1;
        int first = 0;
        int last = 0;
        long finalValue = 0; 
        long result = 0;
        while(j>=i){
            if(j!=i){ // here we check both the value is same or not.. 
                first = nums[i]; // store the first element of the array.
                last = nums[j]; // store the last element of the array.
                result = Long.parseLong(""+first + last); // here we concatinate first and last and the value is store in result
                finalValue = finalValue + result; // here we add the result value in this variable.. initial value of this variable is 0...
            }
            else{
                finalValue = finalValue + nums[j]; // when j == i .. then it is happen.....
            }
            j--; // update last pointer.
            i++; // update first pointer.. 
        }
        return finalValue;
    }
    public static void main(String[] args) {
        int arr[] = {5,14,13,8,12};
        long result = findTheArrayConcVal(arr);
        System.out.println(result);
    }
}