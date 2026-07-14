public class FirstUnique {
   static int firstUniqChar(String s) {
        int found = -1;
        int count[] = new int[62];
        for(int i =0; i<s.length(); i++)
        {
            char ch1 = s.charAt(i);
            ch1 = Character.toLowerCase(ch1);
           
            int index = ch1-'a';
            if(ch1>='a' && ch1<='z')
            {
                count[index]++;
            }
           
        }

        for(int i = s.length()-1; i>=0; i--)
        {
          char ch1 = s.charAt(i);
            ch1 = Character.toLowerCase(ch1);
            
            int index = ch1-'a';
            if(count[index] ==1){
                found = i;
            }
        }
        return found;
    }
    public static void main(String[] args)
    {
        String testCase = "loveleetcode";
        int result = firstUniqChar(testCase);
        System.out.println(result);
    }
}
