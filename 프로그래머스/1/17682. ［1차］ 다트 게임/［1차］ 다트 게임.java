class Solution {
    public int solution(String dartResult) {
        int answer = 0;
        int pastScore = 0;
        for(int i = 0; i < dartResult.length(); i++){
            int totalScore = 0;
            int score = dartResult.charAt(i) - '0';
            // System.out.println(score);
            if(dartResult.charAt(i+1) == '0'){
                score = 10;
                i = i + 1;
            }
            char SDT = dartResult.charAt(i+1);
            System.out.println(SDT);
            
            if(SDT == 'S'){
                totalScore = (int)Math.pow(score,1);
            }else if(SDT == 'D'){
                totalScore = (int)Math.pow(score,2);
            }else if(SDT == 'T'){
                totalScore = (int)Math.pow(score,3);
            }
            
            if(i+2 < dartResult.length()){
                if(dartResult.charAt(i+2) == '#'){
                    totalScore = totalScore * -1;
                    i = i + 1;
                    
                }else if(dartResult.charAt(i+2) == '*'){
                    totalScore = totalScore * 2;
                    pastScore = pastScore * 2;
                    i = i + 1;
                    
                }
            }
            i = i + 1;
            
            answer = answer + pastScore;
            pastScore = totalScore;
            
        }
        
        answer = answer + pastScore;
        return answer;
    }
}