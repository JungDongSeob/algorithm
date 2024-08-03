class Solution {
    public int[][] solution(int[][] arr1, int[][] arr2) {
        int[][] answer = new int[arr1.length][arr2[0].length];
        
        for(int i = 0; i < arr1.length; i++){
            // 행
            for(int j = 0; j < arr2[0].length; j++){
                // 열
                for(int k = 0; k < arr1[0].length; k++){
                    for(int l = 0; l < arr2.length; l++){
                        answer[i][j] = answer[i][j] + arr1[k+i][l] * arr2[l][k+j];
                    }
                    break;
                }
            }
        }
        /*
        1 4    1 3 4
        3 2    4 2 1
        4 1
        */
        
        return answer;
    }
}