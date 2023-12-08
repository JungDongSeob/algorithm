import java.util.*;

public class Solution {
    public int solution(int n) {
        int answer = 0;

        boolean goOrStop = true;
        
        while(goOrStop){
            if(n == 0)
                goOrStop=false;
            
            answer = answer + n%10;
            n = n / 10;
            
        }

        return answer;
    }
}