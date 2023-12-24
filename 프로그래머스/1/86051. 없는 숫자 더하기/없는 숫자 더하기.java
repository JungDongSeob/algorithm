class Solution {
    public int solution(int[] numbers) {
        int answer = 0;
        int flag;
        for(int i=0; i<10; i++){
            flag=0;
            for(int j=0; j<numbers.length; j++){
                if(numbers[j]==i)
                    flag=1;
            }
            if(flag==0){
                answer = answer + i;
            }
        }
        return answer;
    }
}