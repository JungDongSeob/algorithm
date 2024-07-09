import java.util.List;
import java.util.ArrayList;

class Solution {
    public int[][] solution(int[][] data, String ext, int val_ext, String sort_by) {
        
        
        List<Data> al = new ArrayList<>();
        List<Data> filter = new ArrayList<>();
        
        for(int i = 0; i < data.length; i++){
            al.add(new Data(data[i][0],data[i][1],data[i][2],data[i][3]));
        }
        
        for(int i = 0; i < data.length; i++){
            if(ext.equals("code") && al.get(i).code < val_ext){
                filter.add(al.get(i));
            }else if( ext.equals("date") && al.get(i).date < val_ext){
                filter.add(al.get(i));
            }else if( ext.equals("maximum") && al.get(i).maximum < val_ext){
                filter.add(al.get(i));
            }else if( ext.equals("remain") && al.get(i).remain < val_ext){
                filter.add(al.get(i));
            }
        }
        int len = filter.size();
        int[][] answer = new int[len][4];
        int x = 0;
        
        for(Data d : filter){
            answer[x][0] = d.code;
            answer[x][1] = d.date;
            answer[x][2] = d.maximum;
            answer[x][3] = d.remain;
            x++;
        }
        
        for(int i = 0; i < len; i++){
            for(int j = 0; j < len -1 -i; j++){
                if(sort_by.equals("code") && answer[j][0] > answer[j+1][0]){
                    int[] tmp = new int[4];
                    tmp[0] = answer[j][0];
                    tmp[1] = answer[j][1];
                    tmp[2] = answer[j][2];
                    tmp[3] = answer[j][3];
                    answer[j][0] = answer[j+1][0];
                    answer[j][1] = answer[j+1][1];
                    answer[j][2] = answer[j+1][2];
                    answer[j][3] = answer[j+1][3];
                    answer[j+1][0] = tmp[0];
                    answer[j+1][1] = tmp[1];
                    answer[j+1][2] = tmp[2];
                    answer[j+1][3] = tmp[3];
                }else if (sort_by.equals("date") && answer[j][1] > answer[j+1][1]){
                    int[] tmp = new int[4];
                    tmp[0] = answer[j][0];
                    tmp[1] = answer[j][1];
                    tmp[2] = answer[j][2];
                    tmp[3] = answer[j][3];
                    answer[j][0] = answer[j+1][0];
                    answer[j][1] = answer[j+1][1];
                    answer[j][2] = answer[j+1][2];
                    answer[j][3] = answer[j+1][3];
                    answer[j+1][0] = tmp[0];
                    answer[j+1][1] = tmp[1];
                    answer[j+1][2] = tmp[2];
                    answer[j+1][3] = tmp[3];
                }else if(sort_by.equals("maximum") && answer[j][2] > answer[j+1][2]){
                    int[] tmp = new int[4];
                    tmp[0] = answer[j][0];
                    tmp[1] = answer[j][1];
                    tmp[2] = answer[j][2];
                    tmp[3] = answer[j][3];
                    answer[j][0] = answer[j+1][0];
                    answer[j][1] = answer[j+1][1];
                    answer[j][2] = answer[j+1][2];
                    answer[j][3] = answer[j+1][3];
                    answer[j+1][0] = tmp[0];
                    answer[j+1][1] = tmp[1];
                    answer[j+1][2] = tmp[2];
                    answer[j+1][3] = tmp[3];
                }else if(sort_by.equals("remain") && answer[j][3] > answer[j+1][3]){
                    int[] tmp = new int[4];
                    tmp[0] = answer[j][0];
                    tmp[1] = answer[j][1];
                    tmp[2] = answer[j][2];
                    tmp[3] = answer[j][3];
                    answer[j][0] = answer[j+1][0];
                    answer[j][1] = answer[j+1][1];
                    answer[j][2] = answer[j+1][2];
                    answer[j][3] = answer[j+1][3];
                    answer[j+1][0] = tmp[0];
                    answer[j+1][1] = tmp[1];
                    answer[j+1][2] = tmp[2];
                    answer[j+1][3] = tmp[3];
                }
            }
        }
        return answer;
    }
}
class Data{
    int code;
    int date;
    int maximum;
    int remain;
    
    public Data(int code, int date, int maximum, int remain){
        this.code = code;
        this.date = date;
        this.maximum = maximum;
        this.remain = remain;
    }
}