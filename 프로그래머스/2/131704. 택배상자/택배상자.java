import java.util.Queue;
import java.util.LinkedList;
import java.util.Stack;

class Solution {
    public int solution(int[] order) {
        int answer = 0;
        
        Stack<Integer> st = new Stack<>();
        Queue<Integer> orderQ = new LinkedList<>();
        
        for(int ni : order){
            orderQ.offer(ni);
        }
        
        for(int i = 1; i <= order.length; i++){
            if(orderQ.peek().intValue() == i){
                orderQ.poll();
                answer++;
                while(!st.isEmpty() && orderQ.peek().intValue() == st.peek().intValue()){
                    orderQ.poll();
                    st.pop();
                    answer++;
                }
            }else{
                st.push(i);
            }
        }
        
        return answer;
    }
}

// class Solution {
//     public int solution(int[] order) {
//         int answer = 0;
        
//         Stack<Integer> st = new Stack<>();
//         int idx = 0;  // order 배열을 가리킬 인덱스
        
//         for(int i = 1; i <= order.length; i++){
//             if(order[idx] == i){
//                 answer++;
//                 idx++;
//                 while(!st.isEmpty() && st.peek() == order[idx]){
//                     st.pop();
//                     answer++;
//                     idx++;
//                 }
//             }else{
//                 st.push(i);
//             }
//         }
        
//         return answer;
//     }
// }