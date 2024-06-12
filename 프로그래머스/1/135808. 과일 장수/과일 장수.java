import java.util.PriorityQueue;
import java.util.Collections;
class Solution {
    public int solution(int k, int m, int[] score) {
        int answer = 0;
        int cnt = 0;
        int a = 0;
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        for(int i = 0 ; i < score.length; i++){
            pq.add(score[i]);
        }
        
        while(pq.size() >= m){
            for(int i = 0; i < m ; i ++){
                a = pq.poll();
                cnt++;
                if(cnt==m){
                    answer = answer + a * cnt;
                    cnt = 0;
                }
            }

        }
        
        return answer;
    }
}