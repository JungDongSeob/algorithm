class Solution {
    public String solution(int n, int t, int m, int p) {
        String answer = "";
        boolean flag = false;
        
        StringBuilder sb = new StringBuilder("");
        int turn = 0;
        for(int k = 0; k < t*m; k++){
            int i = k;
            if(i == 0){
                if((turn % m) + 1== p){
                    sb.append(i);
                }
                turn++;
            }else{
                String num = "";
                int remain = 0;
                while(i != 0){
                    remain = i % n;
                    i = i / n;
                    if(remain == 10) num = "A" + num;
                    else if(remain == 11) num = "B" + num;
                    else if(remain == 12) num = "C" + num;
                    else if(remain == 13) num = "D" + num;
                    else if(remain == 14) num = "E" + num;
                    else if(remain == 15) num = "F" + num;
                    else num = remain + num;
                }

                for(int j = 0; j < num.length(); j++){
                    if((turn % m) + 1 == p){
                        sb.append(num.charAt(j));
                    }
                    turn++;
                    if(sb.length() == t) {
                        flag = true;
                        break;
                    }
                }
            }
            if(flag){
                break;
            }
        }
        
        answer = sb.toString();
        
        return answer;
    }
}