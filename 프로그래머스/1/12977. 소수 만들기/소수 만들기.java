class Solution {
    public int solution(int[] nums) {
        int answer = 0;
        int len = nums.length;
        int number;
        boolean isPrime = true;
        
        // for(int i = 2; i <= 100; i++){
        //     int cnt = 0;
        //     for(int j = 2; j <= Math.sqrt(i); j++){
        //         if(i%j == 0){
        //             cnt++;
        //         }
        //     }
        //     if(cnt == 0){
        //         System.out.println(i);
        //     }
        // }
        for(int i = 0; i< len-2; i++){
            for(int j = i+1; j < len-1; j++){
                for(int k = j+1; k <len; k++){
                    number = nums[i] + nums[j] + nums[k];
                    isPrime = true;
                    for(int l = 2; l <= Math.sqrt(number); l++){
                        if(number%l == 0){
                            isPrime = false;
                        }
                    }
                    
                    if(isPrime){
                        answer++;
                    }
                }
            }
        }

        return answer;
    }
}