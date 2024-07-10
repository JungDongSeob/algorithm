class Solution {
    public String solution(String new_id) {
        String answer = "";
        
        new_id = new_id.toLowerCase();
        System.out.println(new_id);
        new_id = new_id.replaceAll("[^a-z0-9-_.]", "");
        System.out.println(new_id);
        new_id = new_id.replaceAll("[.]{2,}", ".");
        System.out.println(new_id);
        new_id = new_id.replaceAll("^\\.|\\.$", "");
        System.out.println(new_id);
        if( new_id.length() == 0){
            new_id = new_id + "a";
        }
        System.out.println(new_id);
        if(new_id.length()>15){
            new_id = new_id.substring(0,15);
        }
        System.out.println(new_id);
        new_id = new_id.replaceAll("^\\.|\\.$", "");
        System.out.println(new_id);
        if(new_id.length()<=2){
            char repeat = new_id.charAt(new_id.length()-1);
            while(new_id.length()!=3){
                new_id = new_id + repeat;
            }
        }
        System.out.println(new_id);
        answer = new_id;
        
        
        return answer;
    }
}