import java.util.*;

/*
The logic of the problem is very simple.. just you have to know the formula to find the  area .. 
I use two pointer to solve this question which is 'left' & 'right' left is pointing to the frist element of the array and
right pointer is pointing to the last element of the array n the logic is which of the element is small you have to move that 
pointer and before moving make sure calculte the area.And the condition of the loop is left side index should not be overlaped with 
right index. 
*/
public class MaxArea {
    static int contain_MaxWater(int[] height){
        int left = 0; 
        int right = height.length-1;
        int newArea = 0;
        int area = 0;
        while(left<right){
            if(height[left] <= height[right]){
                newArea = Math.min(height[left],height[right])* (right-left);
           
            if(newArea>area){
                area = newArea;
            }
            left++;
             }

             else if(height[right]<=height[left]){
                 newArea = Math.min(height[left],height[right])* (right-left); // This is the formula to find the area
                   if(newArea>area){
                area = newArea;
            }
            right--;
        }
        }

        return area;
    }
    public static void main(String[] args){
        int[] testCase1 = {1,8,6,2,5,4,8,3,7};
        int maxmArea = contain_MaxWater(testCase1);
        System.out.println(maxmArea);
    }
}
