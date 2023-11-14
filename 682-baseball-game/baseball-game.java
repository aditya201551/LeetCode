class Solution {
    public int calPoints(String[] ops) {
        int result=0;
        ArrayList<Integer> score=new ArrayList<>();

        for(String i:ops){
            int len=(score.size()-1);

            switch(i){
                case "C":
                    score.remove(len);
                    break;
                
                case "D":
                    score.add(score.get(len)*2);
                    break;
                case "+":
                    score.add((score.get(len)+score.get(len-1)));
                    break;
                
                default:
                    score.add(Integer.parseInt(i));
            }
        }

        for (int i:score){
                result+=i;
            }

        return result;
    }
}