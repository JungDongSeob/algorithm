
import java.util.Scanner;
import java.io.FileInputStream;


class Solution
{
	public static void main(String args[]) throws Exception
	{
		
		Scanner sc = new Scanner(System.in);
		int T;
		T=sc.nextInt();
		int size = 0;
		for(int test_case = 1; test_case <= T; test_case++)
		{
            size = sc.nextInt();
            int[][] arr = new int[size][size];
            String num;
            
            sc.nextLine();
            
            for(int i = 0; i < size; i++){
            	num = sc.nextLine();
                for(int j = 0; j < size; j++){
                    arr[i][j] = num.charAt(j)-'0';
            	}
            }
            
            int sum = 0;
            int n = size / 2;
            int m = size / 2;
            for(int i = 0; i < size; i++){
            	for(int j = m; j <= n; j++){
                	sum = sum + arr[i][j];
            	}
                if(i<size/2){
                    m--;
                    n++;
                }else{
                    m++;
                    n--;
                }
            }
            System.out.println("#" + test_case + " " + sum);
            
                
		}
	}
}