import java.util.PriorityQueue;

class Solution {
    public int solution(int[] scoville, int K) {
        int answer = 0;
        
        PriorityQueue<Long> pq = new PriorityQueue<>();
        
        for(long ni : scoville){
            pq.offer(ni);
        }
        
        while(pq.peek() < K){
            if(pq.size() < 2) return -1;
            answer++;
            long newOne = pq.poll() + pq.poll() * 2;
            pq.offer(newOne);
        }
        return answer;
    }
}