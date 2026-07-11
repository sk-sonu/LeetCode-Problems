public class Anagram{

    // **************************** Brute Force Approach *******************************

    static boolean isAnagram(String s, String t){
    int length1 = s.length();
    int length2 = t.length();
    int count[] = new int[62];
    boolean isAnagram = false;
    if(length1 == length2){
      for(int i =0; i<length1; i++){
        char ch1 = s.charAt(i);
        ch1 = Character.toLowerCase(ch1);
        int index = ch1-'a';
        int digit = ch1-'0';
        if(ch1>='a' && ch1<='z'){
        count[index]++;
        }
        else if(ch1>='0' && ch1<='9'){
          count[digit]++;
        }
      }
        for(int j =0; j<length2; j++){
        char ch2 = t.charAt(j);
        ch2 = Character.toLowerCase(ch2);
        int index = ch2-'a';
        int digit = ch2-'0';
        if(ch2>='a'&& ch2<='z'){
        count[index]--;
        }
        else if(ch2>='0' && ch2<='9'){
          count[digit]--;
        }
      }
      for(int k = 0; k<count.length;k++){
        if(count[k] != 0){
          isAnagram = false;
          break;
        }
        else{
          isAnagram = true;
        }
      }
    }
    return isAnagram;
    }
    public static void main(String[] args){
        String s = "cat"; // cat // Anagram
        String t = "rat"; // rat // nagaram
        boolean result = isAnagram(s, t);
        System.out.println(result);
    }
}