package days17;

/**
 * @author Bonggu
 * @date 2024. 1. 23.- 오후 3:15:04
 * @subject 예외 처리 (Exception Handling) 
 * @content 내일 시험문제
 */
public class Ex12 {

	public static void main(String[] args) {
		// [예외 처리(Exception Handling)]
		/*
		 * 1. 프로그램 오류(에러) ? 프로그램 오작동하거나 또는 
		 * 		프로그램 오작동 또는 비정상으로 종료되는 원인
		 * 2. 오류의 발생 시점에 따라
		 *		1) 컴파일 오류				: 컴파일할 때 발생하는 오류
		 *			ex) int i = 10	 (세미콜론 없음)
		 *		2) 실행 오류(런타임오류)	: 실행 도중에 발생하는 오류
		 *			ex) int [] m = null;
		 *					m[0] = 1;
		 *			(1) 에러 (Error)			: 메모리 부족, 스택 오버플로우 등 복구할 수 없는 심각한 오류
		 *											  → Error 클래스로 이루어져 있음
		 *												ㄴ 자식 클래스들 존재 (~~~Error라고 이름 뜸)
		 *			(2) 예외 (Exception) 	: 개발자가 수습할 수 있는 비교적 덜 심각한 실행 오류
		 *											  → Exception 클래스로 이루어져 있음
		 *												ㄴ 자식 클래스들 존재 
		 *				- 예외 클래스는 2개의 그룹으로 나뉜다.
		 *				  ㄱ. RuntumeException 클래스와 그 자손클래스들 그룹
		 *					  InextOutOfBoundException
		 *					  NullPointerException
		 *					  ?
		 *				  ㄴ. Exception 클래스와 그 자손 클래스(위 ㄱ. 은 제외)
		 * 3. 예외 처리 (Exception Handling)
		 * 	   - 정의) 프로그램 실행 시 발생할 수 있는 예기치 못한 예외에 대비한 코드를 작성하는 것.
		 * 	   - 목적) 프로그램의 비정상적 종료를 막고 정상 상태를 유지하는 것.
		 * 4. 프로그램 실행할 때 예외가 발생하면
		 *    - JVM의 "예외처리기(UncaughtExceptionHandler)" 가 예외를 받아서 예외의 원인을 화면에 출력한다.
		 * 
		 * 
		 */

	} //main

} //class
