import java.util.Queue;
import java.util.LinkedList;
import java.util.List;
import java.util.ArrayList;

class Solution {
    public int[] solution(int[] progresses, int[] speeds) {
        int[] days = new int[speeds.length];
        List<Integer> ans = new ArrayList<>();
        Queue<Integer> dayQ = new LinkedList<>();
        
        for(int i = 0; i < speeds.length; i++){
            int remainWork = 100 - progresses[i];
            int work = remainWork / speeds[i];
            
            if(remainWork % speeds[i] > 0) work++;
            
            dayQ.offer(work);
        }
        
        while(!dayQ.isEmpty()){
            int finish = dayQ.poll();
            int cnt = 1;
            while(!dayQ.isEmpty()){
                if(dayQ.peek() <= finish){
                    dayQ.poll();
                    cnt++;
                }else{
                    break;
                }
            }
            ans.add(cnt);
        }
        
        int[] answer = new int[ans.size()];
        
        for(int i = 0; i < ans.size(); i++){
            answer[i] = ans.get(i);
        }
        
        /*
        완료까지 걸리는 일자를 큐에 순서대로 넣고
        큐를 뽑고
        cnt = 1
        while
        다음 큐가 첫번째 큐보다 작으면 cnt++
        크면 answer 에 cnt 넣고 끝
        */
        
        return answer;
    }
}