class Solution {
    public String reverseWords(String s) {
        String arr[]=s.split(" ");
        String result="";
        for(String data:arr){
            result+=new StringBuilder(data).reverse().toString()+" ";
        }

        return result.trim();
    }
}