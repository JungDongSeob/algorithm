class Solution {
    public int[] solution(int n, int m) {
        int[] answer;
        int min=0;
        int max=0;
        int tmp1=0;
        int tmp2=0;
        if(n>=m){
            max = n;
            min = m;
        }else{
            max = m;
            min = n;
        }
        
        while(min!=0){
            tmp1 = max % min;
            max = min;
            min = tmp1;
            
        } 
        
        tmp2 = m * n / max;
        answer = new int[] {max, tmp2};
        return answer;
    }
}