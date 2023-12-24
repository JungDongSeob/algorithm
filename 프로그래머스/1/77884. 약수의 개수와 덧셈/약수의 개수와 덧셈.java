class Solution {
    public int solution(int left, int right) {
        int answer = 0;
        int count;
        for(int i = left; i<right+1; i++){
            count = 1;
            for(int j=1; j<i; j++){
                if(i%j==0){
                    count++;
                }
            }
            
            if(count%2==0){
                answer = answer + i;
            }else{
                answer = answer - i;
            }
        }
        return answer;
    }
}