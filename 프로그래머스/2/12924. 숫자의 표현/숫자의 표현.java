class Solution {
    public int solution(int n) {
        int answer = 0;
        int lt = 0;
        int rt = 0;
        int sum = 0;
        
        for(int i = 1; i <= n; i++){
            sum = sum + i;
            rt++;
            // 4 5 6
            if(sum > n){
                while(sum > n){
                    sum = sum - lt;
                    lt++;
                }
            }
            if(sum == n){
                // System.out.println(lt + " " + rt);
                answer++;
            }
        }
        
        
        return answer;
    }
}