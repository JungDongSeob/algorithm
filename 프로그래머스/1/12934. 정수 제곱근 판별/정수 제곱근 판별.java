class Solution {
    public long solution(long n) {
        long answer = 0;
        long root = (long)Math.round((Math.sqrt(n)));

        if(Math.pow(root,2)==n)
            answer = (long)Math.pow(root+1,2);
        else
            answer = -1;
            
        return answer;
    }
}