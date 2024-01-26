class Solution {
    public boolean isPalindrome(String s) {
        s=s.replaceAll("[\\W]|_","").toLowerCase();
        // System.out.println(s);
        if(s.equals("")) return true;

        int i=0;
        int j=s.length()-1;

        while(i<j){
            if(s.charAt(i++)!=s.charAt(j--)) return false;
        }

        return true;
    }
}