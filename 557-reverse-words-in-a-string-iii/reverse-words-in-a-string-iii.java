class Solution {
    public String reverseWords(String s) {
        if(s.length()==1 || s.equals(""))
            return s;

        s=" "+s+" ";
        String result="";
        int start=0;
        String tmp="";
        for(int i=0;i<s.length();i++){
            
            if(s.charAt(i)==' '){
                result+=new StringBuilder(tmp).reverse();
                start=i+1;
                tmp="";
            }
            tmp+=s.charAt(i);
        }

        return result.trim();
    }
}