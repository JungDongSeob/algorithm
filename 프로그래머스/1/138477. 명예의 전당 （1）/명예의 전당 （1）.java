import java.util.PriorityQueue;

class Solution {
    public int[] solution(int k, int[] score) {
        int[] answer = new int[score.length];
        PriorityQueue<Integer> pq = new PriorityQueue<>();

        pq.add(score[0]);
        answer[0] = score[0];
        for(int i = 1; i<score.length; i++){
            if(pq.size() == k && pq.peek() <= score[i]){
                pq.poll();
                pq.add(score[i]);
            }else if(pq.size() < k){
                pq.add(score[i]);
            }

            answer[i] = pq.peek();
        }


        return answer;
    }
}