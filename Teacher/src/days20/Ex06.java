package days20;

import java.text.DecimalFormat;

/**
 * @author kenik
 * @date 2024. 1. 26. - 오후 2:25:45
 * @subject   [ 형식화 클래스 4가지 ]
 * @content   SimpleDateForamt ***
 *            Decimal   Format
 *            Choice    Format
 *            Message   Format
 */
public class Ex06 {

	public static void main(String[] args) {
		// [ Decimal   Format ]
		//   숫자      형식화하는 클래스 
		//          7654321 
		//int money = 3257600;
		//double money = 3257600.826;
		double money = 3257600.8;
		
		// [3] DecimalFormat  숫자->형식화 클래스
		String pattern = "#,###.00";
		// String pattern = "#,###.##";
		// String pattern = "\u00A4#,###";
		DecimalFormat df = new DecimalFormat(pattern);
		String result = df.format(money);
		System.out.println(result);
		
		
		
		// [2]
		/*
		String result = String.format("%,d", money);
		System.out.println(result);
		*/
		
		/* [1]
		// 3     자릿수    7%3==1         콤마
		String strMoney = money +"";
		int moneyLength = strMoney.length();
		String result = "";
		for (int i = 0; i < moneyLength; i++) {
			char one = strMoney.charAt(i);
			int placeValue = moneyLength - i;
			// System.out.println( one +" " + placeValue);
			result += one;
			//if( placeValue != 1 && placeValue % 3 == 1 ) 
			if(  placeValue % 3 == 1 )
				 //System.out.println(",");
				result +=",";
		}	
		System.out.println( result );
		System.out.println( result.substring(0, result.length() -1) );
		*/
 
		
		// 출력 형식 :   "3,257,600"

	} // main

	
	

} // class







