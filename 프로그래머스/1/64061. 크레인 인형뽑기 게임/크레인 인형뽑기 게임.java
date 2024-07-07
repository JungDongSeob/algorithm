import java.util.Stack;
class Solution {
    public int solution(int[][] board, int[] moves) {
        int answer = 0;
        
        Stack<Integer> st = new Stack<>();
        
        for(int i = 0; i < moves.length; i++){
            int y = moves[i] - 1;
            for(int j = 0; j < board.length; j++){
                if(board[j][y] != 0){
                    if(!st.isEmpty()){
                        if(st.peek() == board[j][y]){
                            // System.out.println(board[j][y]);
                            // System.out.println(st.peek());
                            st.pop();
                            answer = answer + 2;
                        }else{
                            st.push(board[j][y]);
                        }
                    }else{
                        st.push(board[j][y]);
                    }
                    board[j][y] = 0;
                    break;
                }
            }
        }
        
        
        return answer;
    }
}