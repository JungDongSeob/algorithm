class Solution {
    public long solution(int n) {
        long answer = 0;
        long[] stair = new long[n+1];
        
        stair[0] = 1;
        stair[1] = 1;
        
        for(int i = 2; i <= n; i++){
            stair[i] = (stair[i-1] + stair[i-2]) % 1234567;
        }
        
        answer = stair[n];
        
        return answer;
    }
}