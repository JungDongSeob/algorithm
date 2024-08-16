import java.util.Stack;

class Solution {
    public int[] solution(int[] prices) {
        int[] answer = new int[prices.length];
        
        Stack<int[]> st = new Stack<>();
        
        
        for(int i = 0; i < prices.length; i++){
            while(!st.isEmpty()){
                if(st.peek()[0] > prices[i]){
                    answer[st.peek()[1]] = i - st.peek()[1];
                    st.pop();
                }else{
                    break;
                }
            }
            st.add(new int[] {prices[i], i});
        }
        
        int len = st.size();
        for(int i = 0; i < len; i++){
            answer[st.peek()[1]] = answer.length - st.peek()[1] - 1;
            st.pop();
        }
        
        return answer;
    }
}