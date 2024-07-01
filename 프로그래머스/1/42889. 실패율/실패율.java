import java.util.HashMap;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

class Solution {
    public int[] solution(int N, int[] stages) {
        int[] answer = new int[N];
        int totalCount = stages.length;
        
        HashMap<Integer, Integer> map = new HashMap<>();
        List<Failure> al = new ArrayList<>();
        
        for(int i = 1; i <= N+1; i++){
            map.put(i, 0);
        }
        
        for(int i = 0; i < stages.length; i++){
            map.put(stages[i], map.get(stages[i])+1);
        }
        
        for(int i = 1; i <= N; i++){
            int cnt = map.get(i);
            if(cnt == 0){
                al.add(new Failure(i, 0));
            }else{
                al.add(new Failure(i, (float)cnt/totalCount));
            }
            totalCount = totalCount - cnt;
        }
        
        Collections.sort(al);
        
        for(int i = 0; i < N; i++){
            answer[i] = al.get(i).num;
            System.out.println(" num : " + answer[i] + " rate : " + al.get(i).failRate);
        }
        return answer;
    }
}
class Failure implements Comparable<Failure>{
    int num;
    float failRate;
    
    @Override
    public int compareTo(Failure o){
        if(o.failRate == this.failRate){
            return this.num - o.num;
        }else{
            if(this.failRate - o.failRate > 0){
                return -1;
            }else if(this.failRate - o.failRate == 0){
                return 0;
            }else{
                return 1;
            }
        }
    }
    public Failure (int num, float failRate){
        this.num = num;
        this.failRate = failRate;
    }
}