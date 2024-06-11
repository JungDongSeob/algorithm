import java.util.List;
import java.util.ArrayList;
class Solution {
    public int[] solution(int[] answers) {
        
        List<Integer> al = new ArrayList<>();
        int[] one = {1,2,3,4,5};
        int[] two = {2,1,2,3,2,4,2,5};
        int[] three = {3,3,1,1,2,2,4,4,5,5};
        int[] correct = new int[3];
        
        for(int i = 0; i < answers.length; i++){
            if(answers[i] == one[i%5]){
                correct[0]++;
            }
            if(answers[i] == two[i%8]){
                correct[1]++;
            }
            if(answers[i] == three[i%10]){
                correct[2]++;
            }
        }
        int max = 0;
        int idx = 0;
        int cnt = 0;
        for(int i = 0; i < correct.length; i++){
            if(max < correct[i]){
                max = correct[i];
                idx = i;
            }
        }
        for(int i = 0; i < correct.length; i++){
            if(max == correct[i]){
                al.add(i+1);
            }
        }
        int[] answer = new int[al.size()];
        for(int i = 0; i < al.size(); i++){
            answer[i] = al.get(i);
        }
        return answer;
    }
}