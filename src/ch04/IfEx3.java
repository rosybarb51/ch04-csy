package ch04;

public class IfEx3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		변수를 선언하고 사용하기 전에 데이터를 초기화하지 않을 경우 원하지 않는 결과가 출력될 수 있다.
//		정확한 결과가 출력될 수 있도록 사용 전에 반드시 초기화 작업을 진행해야 함
		int age = 6; // 변수 값 초기화
		int charge; // 변수 값 초기화하지 않음, 선언만 함
		
		if (age < 8) {
			charge = 100; // 데이터를 저장하여 변수를 초기화 함
			System.out.println("취학 전 아동입니다.");
		}
		else if (age < 14) {
			charge = 2000;
			System.out.println("초등학생입니다.");
		}
		else if (age < 20) {
			charge = 2500;
			System.out.println("중, 고등학생입니다.");
		}
		else {
			charge = 3000;
			System.out.println("일반인입니다.");
		}
		
		System.out.println("입장료는 " + charge + "원 입니다.");
		
		
		System.out.println("----- if문을 여러개 사용했을 경우 -----");
		
		age = 6;
		
		if (age < 8) {
			charge = 1000;
			System.out.println("취학전 아동 입니다.");
		}
		
		if (age <14) {
			charge = 2000;
			System.out.println("초등학생 입니다.");
		}
		
		if (age < 20) {
			charge = 2500;
			System.out.println("중, 고등학생 입니다.");
		}
		else {
			charge = 3000;
			System.out.println("일반인 입니다.");
		}
		
		System.out.println("입장료는 " + charge + "원 입니다.");
	}
}
