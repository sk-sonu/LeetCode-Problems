import java.util.*;
public class CandyProblem{

    static List<Boolean> KidsWithCandies(int candies[], int extracandies){
        List<Boolean> list = new ArrayList<>();
        int max= 0 ;
        for(int i=0; i<candies.length; i++){
            if(candies[i]>max){
                max = candies[i];
            }
        }
        for(int i = 0; i<candies.length; i++){
            if(candies[i] +extracandies >= max){
                list.add(true);
            }
            else{
                list.add(false);
            }
        }
        return list;
    }

    /* 
    ********* Easy n Detailed Explanation ******
    This is LeetCode 1431 Problem. The Statement of the problem is looks very tough.. but actually it is actually very simple.. We are given an array of candies and you have to find the maximum element i.e. of this array which represents the highest candies. and  there is given  extracandies, so the work is very simple.. you have to check all the elements of the candies array like this.. 
    maxm = 5, and extracandies = 3;
    so 
    candies[] = {2,3,5,1,3}
    i = 0;
    candies[0] = 2; --->> 2+3 >= maxm ----- is it true or not.. so 2+3 = 5. so 5>=5 .. Hence, we store true in the list.. 
    i = 1;
    candies[1] = 3; ---->> 3+3 = 6... and 6>=5 --- true.
    i = 2;
   candies[2] = 5; ---->> 3+5 = 8... and 8>=5 --- true.
   i = 3;
   candies[3] = 1; ---->> 1+3 = 4... and 4>=5 --- false.
   i = 4;
   candies[4] = 3; ---->> 3+3 = 6... and 6>=5 --- true.
    */
    public static void main(String[] args){
        int candies[] = {2,3,5,1,3};
        int extracandies = 3;
        List<Boolean> list = new ArrayList<>();
     list =   KidsWithCandies(candies, extracandies);
     printList(list);
    }

     static void printList(List<Boolean> list){
    for(Boolean value : list)
    {
        System.out.print(value + " ");
    }
    System.out.println();
}
    static void displayArray(int arr[]){
        for(int i = 0; i<arr.length;i++){
            System.out.print(arr[i]);
        }
        System.out.println();
    }
}