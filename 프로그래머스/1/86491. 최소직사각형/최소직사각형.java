class Solution {
    public int solution(int[][] sizes) {
        int answer = 0;
        int maxW = 0;
        int maxH = 0;
        
        for(int i = 0; i < sizes.length; i++){
            if(sizes[i][0] < sizes[i][1]){
                int tmp = 0;
                tmp = sizes[i][0];
                sizes[i][0] = sizes[i][1];
                sizes[i][1] = tmp;
            }
        }
        
        for(int i = 0; i < sizes.length; i++){
            if(maxW < sizes[i][0] && maxH < sizes[i][1]){
                maxW = sizes[i][0];
                maxH = sizes[i][1];
            }else if(maxW < sizes[i][0] && maxH >= sizes[i][1]){
                maxW = sizes[i][0];
            }else if(maxW >= sizes[i][0] && maxH < sizes[i][1]){
                maxH = sizes[i][1];
            }
        }
        answer = maxW * maxH;
        return answer;
    }
}