class Solution {
    public String addBinary(String a, String b) {
        int carry=0;
        int i=a.length()-1;
        int j=b.length()-1;

        String res="";

        while(i>=0 || j>=0){
            int sum=carry;

            if(i>=0) sum+=a.charAt(i)-'0';
            if(j>=0) sum+=b.charAt(j)-'0';

            res=Integer.toString(sum%2)+res;

            carry=sum/2;

            i--;
            j--;
        }

        if(carry!=0) res=Integer.toString(carry)+res;

        return res;

    }
}