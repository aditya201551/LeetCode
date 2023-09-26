class Solution {
    public String mergeAlternately(String word1, String word2) {
        String result="";
        int min=Math.min(word1.length(),word2.length());
        int i=0;

        while(i<min){
          result+=word1.charAt(i)+""+word2.charAt(i);
          i++;
        }

        while(i<word1.length()){
          result+=word1.charAt(i++);
        }
        while(i<word2.length()){
          result+=word2.charAt(i++);
        }

        System.out.println(result);
        return result;
    }
}