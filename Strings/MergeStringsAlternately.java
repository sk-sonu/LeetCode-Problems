public class MergeStringsAlternately {
    static String mergeAlternately(String word1, String word2) {
        int n1 = word1.length();
        int n2 = word2.length();
        StringBuilder sb = new StringBuilder(n1+n2);
        int i =0;
        int j =0;
        while(i<n1 && j<n2)
        {
            char ch1 = word1.charAt(i);
            char ch2 = word2.charAt(j);
            sb.append(ch1);
            i++;
            sb.append(ch2);
            j++;
        }

        if(j==n2 && i !=n1 )
        {
            while(i<n1)
            {
                sb.append(word1.charAt(i));
                i++;
            }
        }
        else if(i == n1 && j !=n2)
        {
            while(j<n2)
            {
                sb.append(word2.charAt(j));
                j++;
            }
        }
        return sb.toString();
    }
    public static void main(String[] args)
    {
        String word1 = "abc";
        String word2 = "pqr"; 
        String str = mergeAlternately(word1, word2);
        System.out.println(str);
    }
}
