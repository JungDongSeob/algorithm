import java.util.Queue;
import java.util.LinkedList;
import java.util.ArrayList;
import java.util.List;
class Solution {
    public int[] solution(int[] progresses, int[] speeds) {

        
        
        /*
        앞에 작업은 자유롭게 끝날 수 있음
        하지만 배포는 앞에 작업이 배포되어야 뒤에 작업도 배포가능
        배포는 하루에 한 번
        하루에 몇 개의 작업이 배포되는지 return
        
        작업이 완료하는 시간인 time 배열 선언
        앞의 작업이 완료되어야 뒤의 작업이 완료 되므로 Queue 선언
        
        Queue에 작업완료시간을 넣어줌
        하나를 poll을 해서 새로운 변수에 넣어주고 peek를 통해 poll한 시간보다 낮으면 peek값도 poll
        해주고 한번에 빠진 작업수를 리스트에 추가
        다시 poll한게 peek값보다 작으면 peek값을 새로운 변수에 넣어주고 반복
        */
        
        int[] time = new int[progresses.length];
        int progressesTime = 0;
        Queue<Integer> queue = new LinkedList<>();
        List<Integer> answerList = new ArrayList<>();
        int count = 1;
        int nd = 1;
        for(int i=0; i< time.length; i++){

            for(int days=1; days<=100; days++){
                progresses[i] = progresses[i] + speeds[i];
                if(progresses[i]>=100){
                    time[i]=days;
                    System.out.println(days);
                    break;
                }
            }
        }
        
        for(int i=0; i<time.length; i++){
            queue.add(time[i]);
        }
        
        progressesTime = queue.poll();
        while(nd!=time.length){
            if(progressesTime>=queue.peek()){
                queue.poll();
                count++;
            }else{
                answerList.add(count);
                progressesTime = queue.poll();
                count=1;
            }
            
            if(nd==time.length-1){
                answerList.add(count);
            }
            nd++;
        }
        
        int[] answer = new int[answerList.size()];
        
        for(int i=answerList.size()-1; i>=0; i--){
            answer[i]=answerList.get(i);
        }
        
        return answer;
    }
}