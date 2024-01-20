import java.util.*;

public class Solution {
    public int[] solution(int []arr) {

        
        /*
        list생성
        arr[i]의 값이 arr[i-1]과 다르다면 list에 넣어줌
        
        list의 값을 다시 answer에 넣어줌
        */

        List newList = new ArrayList();
        newList.add(arr[0]);
        
        for(int i = 1; i<arr.length; i++){
            if(arr[i]!=arr[i-1]){
                newList.add(arr[i]);
            }
        }
        
//         int[] answer = new int[newList.size()];
        
        
//         for (int i = 0 ; i < newList.size() ; i++){
//             answer[i] = Integer.parseInt(newList.get(i));

//         }

        int[] answer = new int[newList.size()];
        for(int i=0; i<newList.size(); i++){
            // System.out.print(newList.get(i)+" ");
            answer[i] = (int)newList.get(i);
        }
        return answer;

    }
}