class Solution {
    public int solution(int n, int[] lost, int[] reserve) {
        int answer = 0;
        /*
        lost번호가 reserver 번호보다 1 작다면 같이 lost는 null
        null이 아닌 개수 
        */
        
        for(int i=1; i<reserve.length; i++){
            for(int j=0; j<reserve.length - 1; j++){
                if(reserve[i]<reserve[j]){
                    int tmp = reserve[j];
                    reserve[j] = reserve[i];
                    reserve[i] = tmp;
                }
            }
        }
        
        for(int i=1; i<lost.length; i++){
            for(int j=0; j<lost.length - 1; j++){
                if(lost[i]<lost[j]){
                    int tmp = lost[j];
                    lost[j] = lost[i];
                    lost[i] = tmp;
                }
            }
        }
        
         for(int i=0; i<reserve.length; i++){
            for(int j=0; j<lost.length; j++){
                if(reserve[i]==lost[j]){
                    lost[j] = -4;
                    reserve[i] = -2;
                }
            }
         }
        
        for(int i=0; i<reserve.length; i++){
            for(int j=0; j<lost.length; j++){
                if(reserve[i]==lost[j] - 1 || reserve[i] == lost[j] + 1){
                    lost[j] = -4;
                    reserve[i] = -2;
                }
            }
        }

        // for(int i=0; i<reserve.length; i++){
        //     for(int j=0; j<lost.length; j++){
        //         if(reserve[i]==lost[j]-1){
        //             lost[j] = -4;
        //             reserve[i] = -2;
        //         }
        //     }
        // }


        int count = 0;
        
        for(int i=0; i<lost.length; i++){
            if(lost[i]!=-4)
                count++;
        }
        answer = n - count;
        
        // for(int i=0; i<lost.length; i++)
        //     System.out.print(lost[i] + " ");
        
        return answer;
    }
}