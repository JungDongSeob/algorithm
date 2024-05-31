class Solution {
    static int[] check;
    static int answer = 0;
    public void dfs(int level, int sum, int[] number){
        if(level > 3){
            return;
        }
        if(level == 3 && sum == 0){
            answer++;
        }else{
            for(int i = 0; i < number.length; i++){
                if(check[i]==0){
                    check[i] = 1;
                    dfs(level+1, sum+number[i], number);   
                    check[i] = 0;
                }
            }
        }
    }
    public int solution(int[] number) {
        check = new int[number.length];
        
        dfs(0, 0, number);
        
        return answer/6;
    }
}