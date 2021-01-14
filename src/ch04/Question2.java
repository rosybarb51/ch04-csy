package ch04;

import java.util.Scanner;

public class Question2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		문제 1) 무한 루프를 사용하여 화면 UI가 매번 출력될 수 있도록 하고 사용자의 입력에 의해서 프로그램이 종료되는 기능을 가지고 있는 구구단 출력 프로그램 작성하세요
//		1. 종료 여부 입력
//		2. 출력할 단수 입력
//		3. next() : 엔터키가 입력될때까지 입력된 데이터를 문자열로 입력받음
//		4. 문자열 비교 : 문자열변수.equals("비교할 문자열");
//		String a = "문자열";
//		a.equals("문자열");
		
		Scanner sc = new Scanner(System.in);
		int dan = 0; // 단수 입력 받는 변수
		String exit = ""; // 종료 문자 받기 위한 변수
		
//		프로그램 시작 시 한번 출력하는 문구
		System.out.println("구구단 출력 프로그램 입니다.");
		
//		프로그램의 메인 부분
		while (true) {
//			***** 구구단을 출력하기 위한 로직 *****
//			구구단 출력을 위한 단수 입력 부분
			System.out.print("출력할 단수를 입력해주세요 : ");
			dan = sc.nextInt(); // 사용자 입력(숫자)
			int count = 1;
			
//			실제 구구단 출력부분
			while (count < 10) {
				System.out.println(dan + " * " + count + " = " + dan * count);
				
				count++; // 증감식
			}
//			***** 구구단을 출력하기 위한 로직 *****
			
//			***** 프로그램을 종료하기 위한 로직 *****
			System.out.print("프로그램을 종료하겠습니까?(y/n)");
			exit = sc.next(); // 사용자 입력 (y/n)
			
//			equals() : 동일한 문자열일 경우 true 출력, 다를 경우 false 출력
			if (exit.equals("y")) {
				System.out.println("프로그램을 종료합니다.");
				break;
			}
//			***** 프로그램을 종료하기 위한 로직 *****
		}
		
		sc.close();
	}
}
