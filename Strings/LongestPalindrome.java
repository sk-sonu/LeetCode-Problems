public class LongestPalindrome {
   static public int longestPalindrome(String s) {
        boolean isOdd = false;
         int n = s.length();
         int count =0;
         int frequency[] = new int[62];
        for(int i =0; i<n; i++)
        {
            char ch1 = s.charAt(i);
            char ch2 = s.charAt(i);

            if(ch1>='a' && ch1<='z') // check if the character is lowercase then.... go inside..
                {
                int index1 = ch1-'a';
                frequency[index1]++; 
            }
            else if(ch1>='A' && ch1<='Z') // check if the character is uppercase.. go inside.. 
            {
                int index2 = ch2-'A'+26; // this +26 is because of suppose if the character is 'A' then A - A = 0.. but.. 0 is 'a' so +26 is the first index of capital letters... thats the logic... 
                frequency[index2]++;
            }
            
        }

        for(int i =0; i<frequency.length; i++)
        {
            
            if(frequency[i]%2 == 0) // if frequency is even . .then  add with count.. 
            {
                count+= frequency[i];
            }
            else if(frequency[i]%2!=0) // if this is even.. subtract one. so the number will be even or zero.. take that.. isOdd = true..
            {
                count = count+ frequency[i] -1;
                isOdd = true;
            }
        }
        if(isOdd) // if there is any even frequency of number.. we can take only one... for middle portion.. so count++
        { 
            count++;
        }
        return count;
    }
    public static void main(String[] args)
    {
        String s = "abccccdd";
        int count = longestPalindrome(s);
        System.out.println(count);
    }
}
