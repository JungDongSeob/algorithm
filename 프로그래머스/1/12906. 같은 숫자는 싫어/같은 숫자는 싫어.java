import java.util.*;

public class Solution {
    public int[] solution(int []arr) {

        

        
        Stack<Integer> newStack = new Stack<>();
        
        newStack.push(arr[0]);
        
        for(int i=1; i<arr.length; i++){
            if(newStack.peek() !=arr[i]){
                newStack.push(arr[i]);
            }
        }
        System.out.print(newStack.size());
        
        int[] answer=new int[newStack.size()];
        
        for(int i=answer.length-1; i>=0; i--){
            answer[i]=newStack.pop();
        }
        
        return answer;

    }
}