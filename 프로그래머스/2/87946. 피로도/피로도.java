class Solution {
    static int[] check;
    static int answer;
    public void dfs(int level, int k, int[][] dungeons){
        for(int i = 0; i < dungeons.length; i++){
            if(check[i] == 0 && k >= dungeons[i][0]){
                check[i] = 1;
                dfs(level + 1, k - dungeons[i][1], dungeons);
                check[i] = 0;
            }
        }
        answer = Math.max(answer, level);
    }
    public int solution(int k, int[][] dungeons) {
        answer = 0;
        
        check = new int[dungeons.length];
        
        for(int i = 0;i < dungeons.length; i++){
            if(check[i] == 0 && k >= dungeons[i][0]){
                check[i] = 1;
                dfs(1, k - dungeons[i][1], dungeons);
                check[i] = 0;
            }
        }
        
        return answer;
    }
}