public class ReverseString3 {
    static public String reverseWords(String s) {
        int n  = s.length();
        char[] arr = s.toCharArray();
        int right =0;
        int nextStart = 0;
        for(int i =0 ; i<n; i = nextStart+1)
        {
            right = nextStart+1;
            int left = i;
            
            while(  right<n  &&arr[right]!=' ')
            {
                right++;
            }
             nextStart = right;
             if(right==n  || arr[right] ==' ')
             {
                right--;
             }
             
            
            while(left<right)
            {
                char temp = arr[left];
                arr[left] = arr[right];
                arr[right] = temp;
                left++;
                right--;
            }
        }
        String ans = new String(arr);
        return ans;
    }
    public static void main(String[] args)
    {
        String s = "Let's take LeetCode contest";
        String ans = reverseWords(s);
        System.out.println(ans);
    }
}
