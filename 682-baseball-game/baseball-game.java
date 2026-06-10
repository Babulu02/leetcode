class Solution {
    public int calPoints(String[] operations) {
        int sum = 0;
        ArrayList<Integer> score = new ArrayList<>();
        for(int i = 0; i < operations.length; i++){
            switch(operations[i]){
                case "C" :
                  score.remove(score.size()-1);
                  break;
                case "D" :
                  score.add(score.get(score.size()-1) * 2);
                  break;
                case "+" :
                  score.add(score.get(score.size()-1)+score.get(score.size()-2));
                  break;
                default :
                  score.add(Integer.valueOf(operations[i]));
            }
        }
        for(int x : score){
            sum += x;
        }
        return sum;
    }
}