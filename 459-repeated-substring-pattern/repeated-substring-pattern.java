class Solution {
    public boolean repeatedSubstringPattern(String s) {

        if(s.length()==1)
            return false;

        String tmp=s+s;
        tmp=tmp.substring(1,tmp.length()-1);
        return tmp.indexOf(s)!=-1;
    }
}