class Solution {
    public long solution(long n) {
        long answer = 0;
        boolean goOrStop = true;
        long[] numArr = new long[String.valueOf(n).length()];
        // String[] resultArr = new String(String.valueOf(n).length());
        
        int count = 0;
        long tmp = 0;
        while(goOrStop){
            numArr[count] = n%10;
            n = n/10;
            count = count + 1;
            
            if(n == 0)
                goOrStop = false;
        }
        
        for(int i=0; i<numArr.length-1; i++){
            for(int j=i; j<numArr.length; j++){
                if(numArr[i]<numArr[j]){
                    tmp = numArr[i];
                    numArr[i] = numArr[j];
                    numArr[j] = tmp;
                }
            }
        }
        
        for(int i = 0; i<numArr.length; i++){
            answer = answer + numArr[i]*(long)Math.pow(10,count-1);
            System.out.println(count);
            count--;
        }
        // for(int i=0; i<numArr.length; i++){
        //     System.out.println(numArr[i]);
        // }
        
        return answer;
    }
}