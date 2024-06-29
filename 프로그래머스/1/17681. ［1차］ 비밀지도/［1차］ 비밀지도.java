class Solution {
    public String[] solution(int n, int[] arr1, int[] arr2) {
        String[] answer = new String[n];
        StringBuilder sb = new StringBuilder();

        int a = 0;
        int b = 0;
        int tmp = 0;
        // System.out.println(Math.pow(3,2));
        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                if(arr1[i]!=0){
                    a = arr1[i]%2;
                }else{
                    a = arr1[i];
                }
                if(arr2[i]!=0){
                    b = arr2[i]%2;
                }else{
                    b = arr2[i];
                }
                arr1[i] = arr1[i]/2;
                arr2[i] = arr2[i]/2;
                
                tmp = a | b;
                
                if(tmp == 0){
                    sb.append(" ");
                }else{
                    sb.append("#");
                }
            }
            answer [i] = sb.reverse().toString();

            sb.delete(0,sb.length());

            // System.out.println("sb1 : " + sb1 + " sb2 : " + sb2);
           
        }

        
        return answer;
    }
}