class Solution {
    public int solution(int n, int[] lost, int[] reserve) {
        int answer = 0;
        int[] status = new int[n+2];
        
        for(int i = 0; i < lost.length; i++){
            status[lost[i]] = -1;
        }
        for(int i = 0; i < reserve.length; i++){
            status[reserve[i]] = status[reserve[i]] + 1; 
        }
        
        for(int i = 1; i < status.length -1; i++){
            if(status[i] == -1 && status[i-1] == 1){
                status[i] = 0;
                status[i-1] = 0;
            }else if(status[i] == -1 && status[i+1] == 1){
                status[i] = 0;
                status[i+1] = 0;
            }
        }
        for(int i = 1; i <status.length-1; i++){
            if(status[i] == 0 || status[i] == 1){
                answer++;
            }
        }
        /*
        학생수 만큼 status + 2
        status[lost[i]] = -1
        status[reserve[i]] = +1
        
        만약 status[n] == -1 이고 n-1이 +1이면
            n = n + 1 , n-1 = n-1 +1
        만약 status[n] == -1 이고 n+1이 +1이면
            n = n + 1 , n+1 = n+1 -1
        */
        
        return answer;
    }
}