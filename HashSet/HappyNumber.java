import java.util.*;
public class HappyNumber {
    public static  boolean solution(int n){
        boolean happy = false;
        int digit ;
        int sum;
        HashSet<Integer>set = new HashSet<>();
        while(true){
            sum = 0;
            while(n>0){
                digit = n%10;
                digit = digit * digit;
                sum = sum + digit;
                n = n/10;
            }
            n = sum;
            if(n ==1){
                happy = true;
                break;
            }
            else if(set.contains(n)){
                happy = false;
                break;
            }
            else{
                set.add(n);
            }
        }
        return happy;
    }
    public static void main(String[] args){
        int testCase1 = 19;
        int testCase2 = 2;
         boolean result1  = solution(testCase1);
         boolean result2  = solution(testCase2);
         System.out.println(result1);
         System.out.println(result2);
    }
}
