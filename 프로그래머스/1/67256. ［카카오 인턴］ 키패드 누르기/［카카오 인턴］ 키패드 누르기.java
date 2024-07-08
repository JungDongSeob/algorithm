import java.util.HashMap;

class Solution {
    public String solution(int[] numbers, String hand) {
        String answer = "";
        
        HashMap<Integer, Number> map = new HashMap<>();
        int[][] phone = {{1,2,3}
                ,{4,5,6}
                ,{7,8,9}
                ,{-1,0,-2}};
        
        for(int i = 0 ; i < phone.length; i++){
            for(int j = 0; j < phone[0].length; j++){
                map.put(phone[i][j], new Number(i, j));
            }
        }
        
        int nowL = -1;
        int nowR = -2;
        
        for(int i = 0; i < numbers.length; i++){
            if(numbers[i] == 1 || numbers[i] == 4 || numbers[i] == 7){
                answer = answer + 'L';
                nowL = numbers[i];
            }else if(numbers[i] == 3 || numbers[i] == 6 || numbers[i] == 9){
                answer = answer + 'R';
                nowR = numbers[i];
            }else {
                Number nowNumberL = map.get(nowL);
                Number nowNumberR = map.get(nowR);
                Number nextNumber = map.get(numbers[i]);
                
                int lengthL = Math.abs(nowNumberL.x - nextNumber.x) + Math.abs(nowNumberL.y - nextNumber.y);
                int lengthR = Math.abs(nowNumberR.x - nextNumber.x) + Math.abs(nowNumberR.y - nextNumber.y);
                
                if(lengthL < lengthR){
                    answer = answer + 'L';
                    nowL = numbers[i];
                }else if(lengthL > lengthR){
                    answer = answer + 'R';
                    nowR = numbers[i];
                }else if(lengthL == lengthR){
                    if(hand.equals("left")){
                        answer = answer + 'L';
                        nowL = numbers[i];
                    }else{
                        answer = answer + 'R';
                        nowR = numbers[i];
                    }
                }
                
            }
        }
        
        return answer;
    }
}
class Number{
    int x;
    int y;
    
    public Number(int x, int y){
        this.x = x;
        this.y = y;
    }
}