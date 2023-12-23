class Solution {
    public int solution(long num) {
        int answer = 0;
        int count = 0;
        
        while(num!=1){
            if(count == 501){
                return answer = -1;
            }
            if(num%2 == 0){
                num = num / 2;
            } else{
                num = (num*3) + 1;
            }
            count = count + 1;
        }
        System.out.print(num);
        answer = count;
        return answer;
    }
}