package days19;

import java.util.Arrays;

/**
 * @author Bonggu
 * @date 2024. 1. 25.- 오전 11:33:28
 * @subject
 * @content
 */
public class Ex02 {

	public static void main(String[] args) {
		String my_str = "abc1Addfggg4556b";
		int n = 6;
		String [] answer = solution(my_str, n);

		System.out.println(Arrays.toString(answer));


	} //main
	public static String[] solution(String my_str, int n) {
		String[] answer = {};	        
		int arraylength = (int) Math.ceil((double)my_str.length() /n);
		answer = new String[arraylength]; 

		StringBuilder sb = new StringBuilder(my_str);
		System.out.println(sb.delete(0, 6));
		
		//answer[0] = sb.substring(0,6); sb.delete(0, 6);
		//answer[1] = sb.substring(0,6); sb.delete(0, 6);
		//answer[2] = sb.substring(0);
		
		for (int i = 0; i < answer.length-1; i++) {
			answer[i] = sb.substring(0,n); sb.delete(0, n);			
		}
		answer[]

		return answer;
	}

} //class