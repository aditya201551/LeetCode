class Solution {
    public boolean judgeCircle(String moves) {
        int upDown=0;
        int rightLeft=0;

       for (char ch : moves.toCharArray() ){
            switch(ch){
                case 'U':
                    upDown++;
                    break;
                case 'D':
                    upDown--;
                    break;
                case 'R':
                    rightLeft++;
                    break;
                case 'L':
                    rightLeft--;
                    break;
            }
        }

        return upDown==0 && rightLeft==0;
    }
}