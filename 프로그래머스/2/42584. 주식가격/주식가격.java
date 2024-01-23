class Solution {
    public int[] solution(int[] prices) {
        int[] answer = new int[prices.length];
        
        /*
        주식가격 배열 price
        price[n]기준으로 price[n+i] <price[n]이면 answer[n] = i;
        n+i가 prices 마지막이면 answer[n]=i 이고 answer[마지막] = 0
        return 떨어지지 않은 기간

        
        n   0   1   2   3   4
        i       1   2   3   4
        n   0   
        i       
            */
        int second=0;
        
        for(int n=0; n<prices.length-1; n++){
            for(int i=n+1; i<prices.length; i++){
                if(prices[n]>prices[i]||i==prices.length-1){
                    // System.out.println("n : " + n + " i : " + i + " i - n : " + (i-n));
                    if(n==2){
                        System.out.println(n+" " + i);
                    }
                    answer[n]=i-n;
                    break;
                }
            }
        }
        
        answer[prices.length-1] = 0;
        return answer;
    }
}