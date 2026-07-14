public class FindTheDifference {
    static char findTheDifference(String s, String t) {
        int count[] = new int[26];
        char ch =' ';
        if(s.length()!=0)
        {
    for(int i =0; i<s.length(); i++)
    {
        char ch1 = s.charAt(i);
        ch1 = Character.toLowerCase(ch1);
        int index = ch1-'a';
        if(ch1>='a'&&ch1<='z')
        {
            count[index]++;
        }
    }
    }
    if(t.length() !=0)
    {
    for(int i =0; i<t.length(); i++)
    {
        char ch1 = t.charAt(i);
        ch1 = Character.toLowerCase(ch1);
        int index = ch1-'a';
        if(ch1>='a' && ch1<='z')
        {
            count[index]--;
        }
    }
    }
    for(int i =0; i<count.length; i++)
    {
        int value =0; 
        if(count[i] <0)
        {
            value = i;
              ch = (char) (value+'a');
        }
      
    }
    return ch;
}
    public static void main(String[] args)
    {
        String test1 = "a"; //"abcd"
        String test2 = "aa"; //"abcde"
        char result = findTheDifference(test1, test2);
        System.out.println(result);
    }
}
