import java.util.*;
class Solution {
    boolean solution(String s) {
        boolean answer = true;
        int count = 0;
        /*
        올바른 괄호이면 true
        올바르지 않은 괄호이면 false
        
        괄호는 반드시 "("로 시작
        괄호는 반드시 ")"로 끝
        올바른 괄호는 반드시 짝지어서 끝나야됨
        
        (은 +1           )은 -1
        단 한번이라도 -1이 되면 false
        마지막에 0이 아니라면 false
        그 외 true
        */
        // String[] newArr = s.split("");
        

//         for(int i=0; i<newArr.length; i++){
//             if(newArr[i].equals("(")){
//                 count++;
//             }else{
//                 count--;
//             }
//             if(count<0){
//                 return false;
//             }
//         }

//         if(count>0){
//             return false;
//         }
        
        char[] newArr = s.toCharArray();
        // if(newArr[newArr.length-1].equals("(")){
        //     return false;
        // }
        Stack<Character> stackStr = new Stack<>();
        try{

            for(int i=0; i<newArr.length; i++){
                if(newArr[i]==('(')){
                    stackStr.push(newArr[i]);
                    count++;
                }else{
                    stackStr.pop();
                    count--;
                }
            }
        }catch(Exception e1){
            return false;
        }
        // if(stackStr.peek().equals("(")){
        //     return false;
        // }
        if(count!=0){
            return false;
        }
        return true;
        

    }
    
}