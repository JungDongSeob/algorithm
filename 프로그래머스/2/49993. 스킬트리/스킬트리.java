import java.util.Queue;
import java.util.LinkedList;

class Solution {
    public int solution(String skill, String[] skill_trees) {
        int answer = 0;

        Queue<Character> SQ = new LinkedList<>();
        Queue<Character> STQ = new LinkedList<>();

        for(String ns : skill_trees){
            for(Character nc : skill.toCharArray()){
                SQ.offer(nc);
            }
            for(Character nc : ns.toCharArray()){
                STQ.offer(nc);
            }

            int size = STQ.size();
            for(int i = 0; i < size; i++){
                if(!SQ.contains(STQ.peek())){
                    STQ.poll();
                }else if(SQ.peek() == STQ.peek()){
                    STQ.poll();
                    SQ.poll();
                }
            }

            if(STQ.size() == 0){
                answer++;
            }
            STQ.clear();
            SQ.clear();
        }
        
        return answer;
    }
}