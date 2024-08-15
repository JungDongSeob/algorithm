import java.util.Arrays;

class Solution {
    public int solution(int[][] land) {
        int answer = 0;
        
        int[] sum = new int[4];
        
        for(int i = 1; i < land.length; i++){
            land[i][0] += Math.max(Math.max(land[i-1][1], land[i-1][2]),land[i-1][3]);
            land[i][1] += Math.max(Math.max(land[i-1][0], land[i-1][2]),land[i-1][3]);
            land[i][2] += Math.max(Math.max(land[i-1][0], land[i-1][1]),land[i-1][3]);
            land[i][3] += Math.max(Math.max(land[i-1][0], land[i-1][1]),land[i-1][2]);
        }

        answer = Arrays.stream(land[land.length-1]).max().getAsInt();
        
        return answer;
    }
}