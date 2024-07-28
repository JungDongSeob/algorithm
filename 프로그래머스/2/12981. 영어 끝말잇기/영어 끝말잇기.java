import java.util.List;
import java.util.ArrayList;

class Solution {
    public int[] solution(int n, String[] words) {
        int[] answer = new int[2];
        int top = 1;
        int set = 1;
        int turn = 1;
        List<String> wordsList = new ArrayList<>();
        

        wordsList.add(words[0]);
        
        
        while(top != words.length){
            if(turn == n){
                turn = 1;
                set = set + 1;
            }else{
                turn = turn + 1;
            }
            if(!wordsList.contains(words[top]) && words[top-1].charAt(words[top-1].length()-1) == words[top].charAt(0)){
                wordsList.add(words[top]);
            }else{
                break;
            }
            top++;
        }

        if(top != words.length){
            answer[0] = turn;
            answer[1] = set;
        }
        
        return answer;
    }
}