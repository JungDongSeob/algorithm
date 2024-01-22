import java.util.Stack;
class Solution {
    boolean solution(String s) {
        boolean answer = true;

        /*
        괄호의 짝이 맞아야한다.
        괄호는 반드시 ")"로 끝나야한다.
        
        문자열 s를 배열로 나눈다.
        "("를 만나면 push한다.
        ")"를 만나면 pop한다.
        
        만약 pop했는데 없을경우 올바르지 않은 괄호이다.
        마지막에 스택의 size가 0이면 올바른 괄호이다.
        */
        
        char[] charArr = s.toCharArray();
        Stack<String> stackStr = new Stack<>();
        
        try{
            for(int i=0; i<charArr.length; i++){
                if(charArr[i]=='('){
                    stackStr.push("(");
                }else{
                    stackStr.pop();
                }
            }
        }catch(Exception e){
            return false;
        }
        if(stackStr.size()!=0){
            return false;
        }
        return true;
    }
}