class Solution {
    public long solution(int a, int b) {
        long answer = 0;
        int tmp;
        if(a==b)
            answer = a;
        else if(a<b){
            tmp = a;
            for(int i = 0; i<b-a+1; i++){
                answer = answer + tmp;
                tmp++;
            }
        } else{
            tmp = b;
            for(int i = 0; i<a-b+1; i++){
                answer = answer + tmp;
                tmp++;
            }
        }
            
        return answer;
    }
}