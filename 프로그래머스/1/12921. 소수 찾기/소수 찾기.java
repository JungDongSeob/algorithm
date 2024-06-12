class Solution {
    public int solution(int n) {
        int answer = 0;
        int cnt = 2;

        int[] num = new int[n+1];
        
        for(int i = 2; i <= Math.sqrt(n); i++){
            if(num[i] == 0){
                for(int j = i*2; j <= n; j = j+i){
                    num[j] = 1;
                }
            }
        }
        
        for(int i = 2; i <= n; i++){
            if(num[i] == 0){
                answer++;
            }
        }
        
        return answer;
    }
}