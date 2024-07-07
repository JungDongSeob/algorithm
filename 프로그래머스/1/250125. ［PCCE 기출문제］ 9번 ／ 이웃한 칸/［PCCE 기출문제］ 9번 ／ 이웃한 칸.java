class Solution {
    public int solution(String[][] board, int h, int w) {
        int answer = 0;
        int[] dx = {-1,0,1,0};
        int[] dy = {0,-1,0,1};
        // int[] dx = [-1,0,1,0];
        // int[] dy = [0,-1,0,1];
        // System.out.println(dy.length);
        int count = 0;
        
        for(int i = 0; i < 4; i++){
            int nx = h + dx[i];
            int ny = w + dy[i];
            
            if(0<=nx && nx < board.length && 0 <= ny && ny < board[0].length && board[h][w].equals(board[nx][ny])){
                count++;
            }
        }
        
        return count;
    }
}