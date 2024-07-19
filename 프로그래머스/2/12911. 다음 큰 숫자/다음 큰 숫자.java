class Solution {
    public int solution(int n) {
        int answer = 0;
        String binaryN = Integer.toBinaryString(n);
        int oneN = 0;
        boolean flag = true;
        for(int i = 0; i < binaryN.length(); i++){
            if(binaryN.charAt(i) == '1') oneN++;
        }
        
        while(flag){
            n++;
            String binaryNext = Integer.toBinaryString(n);
            int nextOne = 0;
            for(int i = 0; i < binaryNext.length(); i++){
                if(binaryNext.charAt(i) == '1') nextOne++;
            }
            if(oneN == nextOne){
                flag = false;
            }
        }
        
        answer = n;
        // String binaryN = "0" + Integer.toBinaryString(n);
        // int one = 0;
        // for(int i = binaryN.length() - 1; i >= 0; i--){
        //     if(one > 0 && binaryN.charAt(i) == '0'){
        //         String pre = binaryN.substring(0, i);
        //         String val = binaryN.substring(i, binaryN.length());
        //         System.out.println(pre);
        //         System.out.println(val);
        //         // System.out.println(val<<1);
        //         break;
        //     }else if (binaryN.charAt(i) == '1'){
        //         one++;
        //     }
        // }
        
        return answer;
    }
}