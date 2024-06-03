class Solution {
    public int[] solution(String s) {
        int[] answer = new int[s.length()];
        char[] chrArr = s.toCharArray();
        
        answer[0] = -1;
        
        for(int i = 1; i < chrArr.length; i++){
            answer[i] = -1;
            for( int j = i-1; j >= 0; j--){
                if(chrArr[i] == chrArr[j]){
                    answer[i] = i - j;
                    break;
                }
            }    
        }
        return answer;
    }
}