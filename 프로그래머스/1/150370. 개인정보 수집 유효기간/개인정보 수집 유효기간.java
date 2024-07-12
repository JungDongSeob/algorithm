import java.util.HashMap;
import java.util.List;
import java.util.ArrayList;

class Solution {
    public int[] solution(String today, String[] terms, String[] privacies) {
        
        HashMap<Character, Integer> map = new HashMap<>();
        List<Integer> al = new ArrayList<>();
        
        for(int i = 0; i < terms.length;i++){
            String[] addMonth = terms[i].split(" ");
            map.put(addMonth[0].charAt(0), Integer.parseInt(addMonth[1]));
        }

        for(int i = 0; i < privacies.length; i++){

            String[] privacy = privacies[i].split(" ");

            String[] agreeDateS = privacy[0].split("\\.");
            int[] agreeDate = new int[3];
            
            int addTime = map.get(privacy[1].charAt(0));

            for(int j = 0 ; j < agreeDate.length; j++){

                agreeDate[j] = Integer.parseInt(agreeDateS[j]);


            }
            
            int month = agreeDate[1] + map.get(privacy[1].charAt(0));
            // System.out.println(agreeDate[1] + " " + month);
            if(month>12){
                if(month%12 == 0){
                    agreeDate[0] = agreeDate[0] - 1 + month / 12;
                    month = 12;
                }else{
                    agreeDate[0] = agreeDate[0] + month / 12;
                    month = month % 12;
                }

                
            }
            agreeDate[1] = month;
            agreeDate[2] = agreeDate[2] - 1;
            
            int avaliableDate = agreeDate[0] * 10000 + agreeDate[1] * 100 + agreeDate[2];
            int intNowDate = Integer.parseInt(today.replace(".", ""));
            System.out.println(avaliableDate + " " + intNowDate);
            if(avaliableDate < intNowDate){
                System.out.println(true);
            }else{
                System.out.println(false);
            }
                if(avaliableDate < intNowDate){
                    al.add(i+1);
                }

            
        }
        int[] answer = new int[al.size()];
        for(int j = 0; j < al.size(); j++){
            answer[j] = al.get(j);
        }
        return answer;
    }
}