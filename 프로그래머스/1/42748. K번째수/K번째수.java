import java.util.*;
class Solution {
    public int[] solution(int[] array, int[][] commands) {
        int[] answer= new int[commands.length];
        
        /*
        값을 넣을 새로운 배열 생성. 크기는 commands 행의 수
        i번째부터 j번째까지 정렬하고 k번째 수
        0행0열 번째 부터 0행1열 번째까지
        i-1               j-1            k-1            인덱스
        추출하면 새로운 배열에 넣기
        
        */
        

        for(int n=0;n<commands.length; n++){
            int num=0;
            int[] newArr = new int[Math.abs(commands[n][0]-commands[n][1])+1];
            for(int m=commands[n][0]-1; m<commands[n][1]; m++){
                newArr[num]=array[m];
                num++;
            }
            Arrays.sort(newArr);
            answer[n]=newArr[commands[n][2]-1];
        }

        return answer;
    }
}