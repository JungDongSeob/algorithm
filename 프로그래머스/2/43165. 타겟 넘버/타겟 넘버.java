class Solution {
    static int[] products = {1, -1};
    static int answer = 0;
    public void dfs(int level, int sum, int target, int[] numbers){
        if(level == numbers.length){
            if(sum == target){
                answer++;    
            }
        }else{
            for(int i = 0; i < 2; i++){
                int num = numbers[level] * products[i];
                sum = sum + num;
                dfs(level + 1, sum, target, numbers);
                sum = sum - num;
            }
        }
    }
    public int solution(int[] numbers, int target) {
        
        dfs(0, 0, target, numbers);
        
        return answer;
    }
}