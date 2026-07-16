public class DefangingAnIPAdress {
    static String defangIPaddr(String address) {
        int n = address.length();
        StringBuilder sb = new StringBuilder();
        for(int i =0; i<n;i++)
        {
            char ch = address.charAt(i);
            if(ch !='.')
            {
                sb.append(ch);
            }
            else if(ch =='.')
            {
                sb.append('[');
                sb.append(ch);
                sb.append(']');
            }
        }
        return sb.toString();
    }
    public static void main(String[] args)
    {
        String address = "1.1.1.1";
        String str = defangIPaddr(address);
        System.out.println(str);
    }
}
