import java.util.Arrays;
import java.math.BigInteger;

class Solution {
    public BigInteger solution(int[] arr) {
        BigInteger answer = new BigInteger("1");
        boolean flag = false;
        
        Arrays.sort(arr);
        

        for(int i = 2; i <= arr[arr.length-1]; i++){
            int cnt = 0;
            for(int j = 0; j < arr.length; j++){
                if(arr[j]%i == 0) cnt++; 
            }
            if(cnt >= 2){

                for(int j = 0; j < arr.length; j++){
                    if(arr[j] % i == 0){
                        arr[j] = arr[j] / i;    
                    }
                }
                answer = answer.multiply(BigInteger.valueOf(i));
                i = 1;
                Arrays.sort(arr);
            }
            
        }
        
        
        for(int j = 0; j < arr.length; j++){
            answer = answer.multiply(BigInteger.valueOf(arr[j]));
        }

        
        return answer;
    }
}