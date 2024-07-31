import java.util.Stack;
import java.util.Map;
import java.util.HashMap;


class Solution {
    public int solution(String s) {
        int answer = 0;
        
        StringBuilder sb = new StringBuilder(s);

        Map<Character, Character> map = new HashMap<>();
        
        map.put(']','[');
        map.put(')','(');
        map.put('}','{');
        
        for(int i = 0; i < s.length(); i++){
            Stack<Character> st = new Stack<>();
            
            for(Character nc : sb.toString().toCharArray()){
                if(!st.isEmpty() && (nc == '}' || nc == ')' || nc == ']')){
                    if(map.get(nc) == st.peek()){
                        st.pop();
                    }else{
                        st.push(nc);
                    }
                }else{
                    st.push(nc);
                }
            }
            
            if(st.size() == 0){
                answer++;
            }
            
            sb.append(sb.substring(0,1));
            sb.delete(0,1);
        }
        
        return answer;
    }
}