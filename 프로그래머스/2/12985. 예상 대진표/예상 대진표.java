class Solution{
    public int solution(int n, int a, int b){
        int answer = 0;
        int round = 0;
        int[] team = {a,b};

        while(true){
            round++;
            for(int i = 0; i < 2; i++){
                if(team[i] % 2 == 0){
                    team[i] = team[i] / 2;
                }else{
                    team[i] = team[i] / 2 + 1;
                }
            }
            if(team[0] == team[1]){
                return round;
            }
        }
    }
}