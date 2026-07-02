import java.util.*;
public class LongestConsecutive {
    public static int solution(int[] nums){
        int longest = 0;
        int current = 0;
        int n = nums.length;
        int length = 1;

        HashSet<Integer>set = new HashSet<>();
            for(int i = 0; i<n; i++){
                set.add(nums[i]);

            }
            for(int value : set){
                if(!set.contains(value-1)) // check wheather the previous value is present in the set or not.. if present.. then we will jump to the next ..
                    {
                    current  = value; 
                    while(set.contains(current+1)) // here we check the next value is present in the set or not... if present.. update current and length;
                        {
                        current++;
                        length++;
                    }
                    longest = Math.max(longest, length);
                    length = 1;
                }
            }
        return longest;
    }
    public static void main(String[] args){
        int testCase1[] = {100,4,200,1,3,2};
        int testCase2[] = {0,3,7,2,5,8,4,6,0,1};
        int length = solution(testCase2);
        System.out.println(length);
    }
}
/*

The logic of the question is very simple. just you have to apply little mathematics here..
Just you find the exact place to start.. suppose .. a number 9,
so the logic.. we will start the sequence.. if number-1 that means 9-1 = 8.. if 8 is not present in the set.. 
bcz if 8 is present . we should start the sequence from 8,, and another logic is where to stop.. suppose a number 9.. 
so the next number is 10... that means .. we will continue the sequence till number+1 is present in the set..
and in every check.. we will update the length... thats it.. 

*/