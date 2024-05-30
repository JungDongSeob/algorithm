class Solution {
    public String solution(String s) {
        String answer = "";
        
//         String[] strArr = s.split("");
//         int idx = 0;
//         for(int i = 0; i < strArr.length; i++){
//             if(strArr[i].equals(" ")){
//                 idx = 0;
//             }
//             if(idx % 2 == 0){
//                 strArr[i] = strArr[i].toUpperCase();
//             }else{
//                 strArr[i] = strArr[i].toLowerCase();
//             }
//             System.out.println("idx : " + idx + " char : " + strArr[i]);

//             idx++;
//             answer = answer + strArr[i];
//         }
        String[] word = s.split(""); //s를 한글잘씩 잘라 word 배열에 담습니다.
        int index = 0;         //홀수, 짝수를 나타나기 위한 index 변수입니다.
        int length = word.length; //word 배열의 길이

        for (int i = 0; i < length; i++) {
            if (word[i].equals(" ")){
                word[i] = " ";
                index = 0;      //공백이후 index 값 초기화 ==0이 된다.
            }else {
                if (index % 2 != 0) {
                    word[i] = word[i].toLowerCase();
                    index++;
                } else if (index % 2 == 0) {
                    word[i] = word[i].toUpperCase();
                    index++;
                }
            }
            answer = answer + word[i];
        }
        return answer;
    }
}