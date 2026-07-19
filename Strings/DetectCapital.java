public class DetectCapital {
   static public boolean detectCapitalUse(String word) {
        boolean isTrue = true;
        int n  = word.length();
        if(n==1)
        {
            return true;
        }
        else
        {
        char ch1 = word.charAt(0);
        char ch2 = word.charAt(1);


        if( (ch1>='A'&& ch1<='Z') && (ch2>='A' && ch2<='Z'))
        {
                for(int i =2; i<n; i++)
                {
                    char ch = word.charAt(i);
                    if(!(ch>='A' && ch<='Z'))
                    {
                        return false;
                    }
                }
        }
        else if((ch1>='a' && ch1<='z')&&(ch2>='a' && ch2<='z'))
        {
            for(int i =2; i<n; i++)
            {
                char ch = word.charAt(i);
                if(!(ch>='a'&& ch<='z'))
                {
                    return false;
                }
            }
        }
        else if((ch1>='A'&& ch1<='Z')&& (ch2>='a' && ch2<='z'))
        {
            for(int i =2; i<n; i++)
            {
                char ch = word.charAt(i);
                if(!(ch>='a'&& ch<='z'))
                {
                    return false;
                }
            }
        }
        else if((ch1>='a'&& ch1<='z') && (ch2>='A'&& ch2<='Z'))
        {
            return false;
        }
        }
        return isTrue;
    }
    public static void main(String[] args)
    {
        String word = "FlaG";
        boolean detect = detectCapitalUse(word);
        System.out.println(detect);
    }
}
