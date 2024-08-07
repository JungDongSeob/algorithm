import java.util.Queue;
import java.util.LinkedList;

class Solution {
    public int solution(int[] priorities, int location) {
        int cnt = 0;
        boolean flag = true;
        int[][] infos = new int[priorities.length][2];
        Queue<int[]> q = new LinkedList<>();
        
        for(int i = 0; i < priorities.length; i++){
            q.offer(new int[]{priorities[i], i});
        }
        
        while(true){
            int[] info = q.poll();
            int lenF = q.size();
            
            for(int[] arr : q){
                if(arr[0] > info[0]){
                    q.offer(new int[]{info[0],info[1]});
                    break;
                }
            }
            
            int lenS = q.size();
            if(lenF == lenS){
                cnt++;
                if(info[1] == location){
                    return cnt;
                }
            }
            
        }
    }
}