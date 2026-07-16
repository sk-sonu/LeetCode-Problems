public class JewelsAndStones {
    static int numJewelsInStones(String jewels, String stones) {
        int n1 = jewels.length();
        int n2 = stones.length();
        int frequency[] = new int[62];
        int sum = 0;
        for(int i =0; i<n1; i++)
        {
            char ch1 = jewels.charAt(i);
            if(ch1>='a' && ch1<='z')
            {
                int index1 = ch1-'a';
                frequency[index1]--;
            }
            else if(ch1>='A' && ch1<='Z')
            {
                int index2 = ch1-'A'+26;
                frequency[index2]--;
            }
        }
        for(int i =0; i<n2; i++)
        {
            
            int index;
            char ch1 = stones.charAt(i);
            if(ch1>='a' && ch1<='z')
            {
                index = ch1-'a';
                if(frequency[index] == -1)
                {
                    sum++;
                }
            }
            else if(ch1>='A' && ch1<='Z')
            {
                index = ch1-'A'+26;
                if(frequency[index] == -1)
                {
                    sum++;
                }
            }
        }
        return sum;
    }
    public static void main(String[] args)
    {
        String jewels = "aA"; 
        String stones = "aAAbbbb";
       int result = numJewelsInStones(jewels, stones);
       System.out.println(result);
    }
}
