class Solution {
    public int solution(int n, int m, int[] section) {
        int answer = 0;
        int[] wall = new int[n+1];
        int[] roller = new int[m];
        
        for(int i = 0; i < section.length; i++){
            wall[section[i]] = 1;
        }
        int cnt = 1;
        while(cnt <= n){
            if(wall[cnt] == 1){
                
                for(int i = 0; i < m; i++){
                    if(cnt + i <= n && wall[i+cnt] ==1){
                        wall[i+cnt] = 0;
                    }
                }
                cnt = cnt + m;
                answer++;
            }else{
                cnt++;
            }
            
        }
        /*
        롤러의 길이 배열화
        칠해야하는 벽 값을 1로
        롤러[0]과 벽[x]=1을 맞추고
        칠해지면 벽을 0으로 만들기
        반복
        */
        return answer;
    }
}