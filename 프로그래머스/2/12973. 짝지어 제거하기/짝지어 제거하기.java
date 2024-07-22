import java.util.Stack;

class Solution{
    public int solution(String s){

        Stack<Character> st = new Stack<>();
        
        st.push(' ');
        
        for(char c : s.toCharArray()){
            if(st.peek() == c){
                st.pop();
            }else{
                st.push(c);
            }
        }
        
        if(st.size() == 1){
            return 1;
        }else{
            return 0;
        }

    }
}