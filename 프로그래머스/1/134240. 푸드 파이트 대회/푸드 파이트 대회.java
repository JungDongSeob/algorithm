class Solution {
    public String solution(int[] food) {
        String answer = "";
        answer = answer + "0";
        
        for(int i = food.length - 1; i > 0; i--){
            if(food[i]>1){
                for(int j = 0; j < food[i]/2; j++){
                    answer = answer + i;
                    answer = i + answer;
                }
            }
        }
        return answer;
    }
}