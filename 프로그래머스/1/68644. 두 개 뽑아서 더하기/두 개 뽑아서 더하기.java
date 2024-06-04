import java.util.Set;
import java.util.HashSet;
import java.util.Iterator;

class Solution {
    public Integer[] solution(int[] numbers) {
        
        Set<Integer> s = new HashSet<>();
        
        for(int i = 0; i < numbers.length - 1; i++){
            for(int j = i+1; j < numbers.length; j++){
                s.add(numbers[i] + numbers[j]);
            }
        }
        
        int size = s.size();

        
        Integer[] answer = s.toArray(new Integer[0]);
        // size = 7;
        // int[] answer = {5,4,3,2,1,7,6};
        for(int i = 0; i < size ; i++){
            for(int j = 0 ; j < size - i - 1; j++){
                if(answer[j] > answer[j+1]){
                    int tmp = 0;
                    tmp = answer[j];
                    answer[j] = answer[j+1];
                    answer[j+1] = tmp;
                }
            }
        }
        
        return answer;
    }
}