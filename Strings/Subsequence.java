public class Subsequence {
    
    
    static  boolean isSubsequence(String s, String t) {
        int n1 = s.length();
        int n2 = t.length();

        boolean marked[] = new boolean[n1];

        boolean isSubsequence_ = true;

        int i =0; 
        int j =0;
    
    while(i<n1 && j<n2)
    {
      
        char ch1 = s.charAt(i);
        char ch2 = t.charAt(j);

        if(ch1==ch2)
        {
            marked[i] = true;
            i++;
            j++;
        }
        else if(ch1!=ch2)
        {
            j++;
        }
    
    }
    if(n1>0){
    if(!marked[n1-1])
    {
        isSubsequence_ = false;
    }
    }
    return isSubsequence_;
    }
    
    public static void main(String[] args){
        String s = "abc";
        String t = "ahbgdc";
    boolean result = isSubsequence(s, t);
    System.out.println(result);
    }
}
