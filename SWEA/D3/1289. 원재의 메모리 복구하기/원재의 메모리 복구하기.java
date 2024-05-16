
import java.util.Scanner;
import java.io.FileInputStream;


class Solution
{
	public static void main(String args[]) throws Exception
	{
		
		Scanner sc = new Scanner(System.in);
		int T;
		T=sc.nextInt();
		/*
		   여러 개의 테스트 케이스가 주어지므로, 각각을 처리합니다.
		*/
		 sc.nextLine();
		for(int test_case = 1; test_case <= T; test_case++)
		{
			
			String init = sc.nextLine();

            char[] arr = init.toCharArray();
            char now = '0';
            int cnt = 0;
			for(int i = 0; i < arr.length; i++){
                if(now!=arr[i]){
                    now = arr[i];
                    cnt++;
                }
            }
			
            System.out.println("#" + test_case + " " + cnt);
		}
	}
}