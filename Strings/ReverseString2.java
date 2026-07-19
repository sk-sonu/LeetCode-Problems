public class ReverseString2 {
    static public String reverseStr(String s, int k) {
        int n = s.length();
           char[] arr = s.toCharArray();
        for(int i = 0; i<n; i = i+(2*k))
        {
            int left = i;
            int right = Math.min(i+k-1,n-1);
           
            while(left<right)
            {
              
                char temp = arr[left];
                arr[left] = arr[right];
                arr[right] = temp;
                left++;
                right--;
            }
        }
        String ans ="";
        ans = new String(arr);
        return ans; 
    }
    public static void main(String[] args)
    {
        String s = "abcdefg";
        int k = 2;
        String str = reverseStr(s, k);
        System.out.println(str);
    }
}
