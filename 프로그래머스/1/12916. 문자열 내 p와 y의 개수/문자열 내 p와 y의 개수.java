class Solution {
    boolean solution(String s) {
        boolean answer = false;
        int countP=0;
        int countY=0;
        String str = s.toLowerCase();
        String[] strArr;
        strArr = str.split("");
        for(int i=0; i<strArr.length; i++){
            if(strArr[i].equals("p"))
                countP++;
            if(strArr[i].equals("y"))
                countY++;
        }
        
        System.out.println(countP +""+ countY);
        if((countP == countY) || (countP==0 && countY==0))
            answer = true;
        return answer;
    }
}