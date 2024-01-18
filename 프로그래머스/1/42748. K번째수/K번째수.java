import java.util.*;
class Solution {
    public int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];

        /*
        k번째
        I~J번쨰 정렬하고 k번째수
        */
        /*
        0행 1열부터 0행 2열의 차이+1 만큼의 배열을 선언
        0행 1열부터 0행 2열 +1 까지의 값을 새로운 배열에 가져옴
        새로운 배열을 정렬
        0행 3열 번째 수를 추출해서 answer에 넣기
        */
        
        for(int k=0; k<commands.length; k++){
            int[] newArr = new int[Math.abs(commands[k][1]-commands[k][0])+1];
            System.out.print(newArr.length);
            int j=0;
            for(int i=commands[k][0]-1; i<commands[k][1]; i++){
                System.out.println(newArr.length);
                newArr[j] = array[i];
                j++;
            }
            Arrays.sort(newArr);
            answer[k]=newArr[commands[k][2]-1];
        }

        
        
        return answer;
    }
}