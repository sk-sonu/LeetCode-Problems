public class LengthOfLastWord{
    static int solution(String s){
        int count =0;

        int i = s.length()-1;
        if(s.charAt(i) == ' '){
            while(i>=0&&s.charAt(i) == ' '){
                i--;
            }
            while(i>=0&&s.charAt(i)!=' '){
                count++;
                i--;
            }
        }
        else{
            while(i>=0&& s.charAt(i)!=' '){
                count++;
                i--;
            }
        }
        return count;
    }
    public static void main(String[] args){
        String testCase1 = "Hello World ";
        int result = solution(testCase1);
        System.out.println(result);
    }
}