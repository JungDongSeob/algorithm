class Solution {
    public String solution(int a, int b) {
        String answer = "";
        int day = 0;
        for(int month = 1; month < a; month++){
            if(month<=7 && month%2==1){
                day = day + 31;
            }else if(month==2){
                day = day + 29;
            }else if(month<=7 && month%2==0){
                day = day + 30;
            }else if(month>7 && month%2==1){
                day = day + 30;
            }else if(month>7 && month%2==0){
                day = day + 31;
            }
            System.out.println(day);
        }
        day = day + b;
        System.out.println(day);
        day = day %7;
        if(day == 0){
            answer = "THU";
        }else if(day == 1){
            answer ="FRI";
        }else if(day == 2){
            answer ="SAT";
        }else if(day == 3){
            answer ="SUN";
        }else if(day == 4){
            answer ="MON";
        }else if(day == 5){
            answer ="TUE";
        }else if(day == 6){
            answer ="WED";
        }
        return answer;
    }
}