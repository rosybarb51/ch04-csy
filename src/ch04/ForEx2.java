package ch04;

// �ڹٿ��� ����� �ܼ� �Է��� �ޱ� ���� Ŭ����
import java.util.Scanner;

public class ForEx2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		���� 1) for ���� ����Ͽ� ����ڰ� �Է��� ������ �������� ����ϴ� ���α׷��� �ۼ��ϼ���
//		import java.util.Scanner; ����
//		Scanner sc = new Scanner(System.in);
		
		Scanner sc = new Scanner(System.in);
		System.out.print("����� �ܼ��� �Է��ϼ��� : ");
		
//		����� �Է��� ���� ������ ����
		int dan = sc.nextInt();
		
		for (int i = 1; i < 10; i++) {
			System.out.println(dan + " * " + i + "= " + dan * i);
		}
		
//		����� �Է��� ���� scanner Ŭ������ �޸𸮿��� ����
		sc.close();
	}
}
