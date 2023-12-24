class Solution {
    public String solution(String phone_number) {
        String answer = "";
        String str;
        System.out.println(phone_number.length());
        StringBuffer sb = new StringBuffer(phone_number);
        for(int i=0; i<phone_number.length()-4;i++){
            sb.replace(i,i+1,"*");
        }
        
        answer = sb.toString();
        // for(int i=0;i<phone_number.length-4;i++){
        //     phone_number[i]="*";
        // }
        
        return answer;
    }
}