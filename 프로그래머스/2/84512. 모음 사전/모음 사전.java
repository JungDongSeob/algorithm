class Solution {
    static char[] alpha = {'A', 'E', 'I', 'O', 'U'};
    static int level = 0;
    static int answer = 0;
    public void dfs( String combi, String word){
        if(answer != 0 || combi.length() > 5) return;
        if(combi.equals(word)){
            answer = level;
        }
        level++;
        for(int i = 0; i < alpha.length; i++){
            dfs(combi + alpha[i], word);
        }
    }
    public int solution(String word) {
        answer = 0;
        
        dfs("",word);
        
        return answer;
    }
}