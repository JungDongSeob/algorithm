import java.util.Stack;

class Solution {
    public int[] solution(int[] numbers) {
        int[] answer = new int[numbers.length];
        
        answer[numbers.length-1] = -1;
        
        Stack<Integer> st = new Stack<>();
        
        st.push(numbers[numbers.length-1]);
        
        for(int i = numbers.length-2 ; i >= 0; i--){
            if(st.peek() <= numbers[i]){
                while(!st.isEmpty()){
                    if(st.peek() <= numbers[i]){
                        st.pop();
                    }else if(st.peek() > numbers[i]){
                        answer[i] = st.peek();
                        st.push(numbers[i]);
                        break;
                    }
                }
                if(st.size() == 0){
                    st.push(numbers[i]);
                    answer[i] = -1;
                }
            }else{
                answer[i] = st.peek();
                st.push(numbers[i]);
            }
        }

        return answer;
    }
}