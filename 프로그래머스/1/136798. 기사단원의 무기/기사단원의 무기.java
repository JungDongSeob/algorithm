class Solution {
    public int solution(int number, int limit, int power) {
        int answer = 0;
        
        
        for(int i = 1; i <= number; i++){
            int cnt = 0;
            int sqrt = (int)Math.sqrt(i);
            for(int j = 1; j <= sqrt; j++){
                if(i%j == 0){
                    cnt++;
                    if(i/j !=j){
                        cnt++;
                    }
                }
            }
            if(cnt > limit){
                answer = answer + power;
            }else{
                answer = answer + cnt;
            }
        }
        
        return answer;
    }
}