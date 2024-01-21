import java.util.*;
class Solution {
    public int solution(int[] citations) {
        int answer = 0;
                Integer[] newArr = new Integer[citations.length];
        for(int j=0; j<citations.length; j++){
            newArr[j] = citations[j];
        }

        Arrays.sort(newArr, Collections.reverseOrder());
        /*
        citations[i] 번 이상 인용된 논문 h이상이면 최대값은 h이다.
        6       5       3       1       0
        i=0     i=1     i=2     
        i=1     i=2     i=3
        */
        for(int i=0; i<newArr.length; i++){
            if(newArr[i]>i){
                answer++;
            }else{
                break;
            }
        }
        
        return answer;
    }
}