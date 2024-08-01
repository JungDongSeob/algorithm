class Solution {
    public long[] solution(int n, long left, long right) {
        long[] answer = new long[(int)(right - left + 1)];
                
        long rowL = left / n; //0
        long colL = left % n; //0
        long rowR = right / n; //0
        long colR = right % n; //99999
        int cnt = 0;
        
        if(rowL == rowR){
            for(long j = colL; j <= colR; j++){
                if(j <= rowL){
                    answer[cnt++] = rowL+1;
                }else{
                    answer[cnt++] = j+1;
                }
            }
        }else{
            for(long i = rowL; i <= rowR; i++){
                if(i == rowL){
                    for(long j = colL; j < n; j++){
                        if(j <= i){
                            answer[cnt++] = i+1;
                        }else{
                            answer[cnt++] = j+1;
                        }
                    }
                }else if(i == rowR){
                    for(long j = 0; j <= colR; j++){
                        if(j <= i){
                            answer[cnt++] = i+1;
                        }else{
                            answer[cnt++] = j+1;
                        }
                    }
                }else{
                    for(long j = 0; j < n; j++){
                        if(j <= i){
                            answer[cnt++] = i+1;
                        }else{
                            answer[cnt++] = j+1;
                        }
                    }
                } 
            }
        }
        

        return answer;
    }
}