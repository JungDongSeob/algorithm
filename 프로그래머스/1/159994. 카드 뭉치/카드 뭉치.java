class Solution {
    public String solution(String[] cards1, String[] cards2, String[] goal) {
        String answer = "Yes";
        int lt = 0, rt = 0;
        
        for(int i = 0; i < goal.length; i++){
            if(lt < cards1.length && goal[i].equals(cards1[lt])){
                lt++;
            }else if (rt < cards2.length && goal[i].equals(cards2[rt])){
                rt++;
            }else{
                answer="No";
            }
        }
        
        return answer;
    }
}