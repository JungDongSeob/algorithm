import java.util.*;
class Solution {
    public int solution(int[] citations) {
        int answer = 0;
        Integer[] hIndexArr = new Integer[citations.length];
        
        
        for(int j=0; j<citations.length; j++){
            hIndexArr[j]=Integer.valueOf(citations[j]);
        }
        Arrays.sort(hIndexArr, Collections.reverseOrder());
        /*
        내림차순정렬
         6      5       3       1       0
        h = 0 h = 1   h = 2   h = 3
        h = 1 h = 2   h = 3   h = 3
        h = 0이고 편당 +1
        citations[h]가 h이상일경우
        h= h+1이고 반복
        */
        for(int i=0; i<citations.length;i++){
            if(hIndexArr[i] > answer){
                answer++;
            }else{
                break;
            }
        }

        
        return answer;
    }
}