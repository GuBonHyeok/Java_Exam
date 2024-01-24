package days17;

/**
 * @author Bonggu
 * @date 2024. 1. 23.- 오후 12:30:07
 * @subject 인터페이스 사용시 장점
 * @content
 */
public class Ex07 {

	public static void main(String[] args) {
		// 인터페이스의 장점
		// 1. 개발 시간을 단축 시킬 수 있다.
		//		이유 ? 인터페이스만 작성해도 개발 진행 가능. 인터페이스를 구현한 클래스
		// 2. 표준화가 가능하다.
		//    - 프로젝트 진행 -> 인터페이스 작성
		// 3. 서로 관계없는 클래스들에게 관계를 맺어 줄 수 있다.
		//     같은 Super클래스 (조상) 아니더라도, 아무 관계가 없는 클래스들일지라도
		//		동일한 인터페이스만 구현했다면 관계를 맺어줄 수 있다.
		// 4. 독립적인 프로그래밍이 가능하다.
		
		Idisp a1 = new A();
		Idisp b1 = new B();
		
		print(a1);
		print(b1);
		
		// 참고 ) 클래스 제작사(생상자)		-> 	 클래스 물건 사용자
		// 				Provuder								User
		//			인터페이스만 선언							   사용 가능.
		//		구현된 클래스가 만들어지지 않아도              사용가능.
		
	}//main

	static void print(Idisp i) {	
		
	}

}//class

interface Idisp{
		void disp();
}

class A implements Idisp{ //A와 B는 전혀 관계 없는 클래스
	@Override
	public void disp() {

	}
	
} 
class B implements Idisp{
	@Override
	public void disp() {
		
	}
	
}








