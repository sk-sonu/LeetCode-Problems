public class Plindromic {
 static   boolean validPalindromic(String s){
        boolean isPalindromic = true;

        int i =0;
        int j = s.length()-1;

        while(i<j){
            char ch1 = s.charAt(i);
            char ch2 = s.charAt(j);
            ch1 = Character.toLowerCase(ch1);
            ch2 = Character.toLowerCase(ch2);
            if(!(ch1>='a' && ch1<='z') && !(ch1>='0' && ch1<='9')){
                i++;
            }
            else if(!(ch2>='a' &&ch2<='z') && !(ch2>='0' && ch2<='9')){
                j--;
            }
            else if(ch1==ch2){
                i++;
                j--;
            }
            else if(ch1 !=ch2){
                isPalindromic = false;
                break;
            }
        }
        return isPalindromic;
    }
    public static void main(String[] args){
        String testCase1 = " ";
        String testCase2 = ";,.";
        String testCase3 = "A man, a plan, a canal: Panama";
        String testCase4 = "race a car";
        boolean result = validPalindromic(testCase4);
        System.out.println(result);
    }
}
