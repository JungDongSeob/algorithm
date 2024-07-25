import java.util.Arrays;

class Solution {
    public int solution(int[] people, int limit) {
        int answer = 0;
        
        Arrays.sort(people);
        int j = people.length -1;
        
        for(int i = 0; i < people.length; i++){
            if(people[i] != 0){
                for(; j >= 0; j--){
                    if(people[j] != 0 && people[i] + people[j] <= limit){
                        people[j] = 0;
                        break;
                    }
                }
                people[i] = 0;
                answer = answer + 1;
            }
        }
        
        return answer;
    }
}