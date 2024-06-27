class Solution {
    public int solution(int[] d, int budget) {
        int answer = 0;
        int sum = 0 ;
        for(int i = 0; i < d.length; i++){
            for(int j = 0 ; j < d.length -1 - i; j++){
                if(d[j]>d[j+1]){
                    int tmp = d[j];
                    d[j] = d[j+1];
                    d[j+1] = tmp;
                }
            }
            
        }
        
        for(int i = 0; i< d.length; i++){
            if(sum+d[i]>budget){
                break;
            }
            sum = sum + d[i];
            answer++;
        }
        
        return answer;
    }
}