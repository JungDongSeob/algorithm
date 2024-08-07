class Solution {
    public long solution(int n) {
        long answer = 0;
        long[] fibo = new long[n+1];
        
        fibo[1] = 1;
        fibo[2] = 1;
        
        if(n > 2){
            for(int i = 3; i <= n; i++){
                fibo[i] = (fibo[i-2]+fibo[i-1]) % 1234567;
                // System.out.println("i : " + fibo[i]);
            }
        }
        
        answer = fibo[n];
        
        return answer;
    }
}