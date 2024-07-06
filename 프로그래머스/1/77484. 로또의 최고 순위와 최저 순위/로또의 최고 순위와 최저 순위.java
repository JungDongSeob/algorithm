import java.util.List;
import java.util.ArrayList;

class Solution {
    public int[] solution(int[] lottos, int[] win_nums) {
        int[] answer = new int[2];
        
        List<Integer> al = new ArrayList<>();
        
        for(int i : win_nums){
            al.add(i);
        }
        
        int cnt = 0;
        for(int i : lottos){
            if(al.contains(i)){
                answer[1]++;   
            }else if( i == 0){
                cnt++;
            }
        }
        answer[0] = answer[1]+cnt;
        
        for(int i = 0; i < 2; i++){
            if(answer[i] == 6){
                answer[i] = 1;
            }else if(answer[i] == 5){
                answer[i] = 2;
            }else if(answer[i] == 4){
                answer[i] = 3;
            }else if(answer[i] == 3){
                answer[i] = 4;
            }else if(answer[i] == 2){
                answer[i] = 5;
            }else{
                answer[i] = 6;
            }
        }
        
        return answer;
    }
}