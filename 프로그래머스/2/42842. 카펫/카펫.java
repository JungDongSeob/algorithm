import java.util.ArrayList;
import java.util.List;
import java.util.Collections;

class Solution {
    public int[] solution(int brown, int yellow) {
        int[] answer = new int[2];
        double root = Math.sqrt(yellow);
        List<Integer> divisor = new ArrayList<>();
        
        for(int i = 1; i <= root; i++){
            if(yellow % i == 0){
                divisor.add(i);
                if(yellow/ i != i){
                    divisor.add(yellow/i);
                }
            }
        }
        
        Collections.sort(divisor);
        
        for(int i = divisor.size()-1; i >= divisor.size()/2; i--){
            int weight = divisor.get(i);
            int height = divisor.get(divisor.size() - i - 1);
            // System.out.println (weight + " " + height);
            
            int total = 2*(weight+2) + 2*height;
            if(total == brown){
                answer[0] = weight+2;
                answer[1] = height+2;
                return answer;
            }
        }
        
        

        
        return answer;
    }
}