package ch04;

import java.util.Scanner;

public class Question2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		���� 1) ���� ������ ����Ͽ� ȭ�� UI�� �Ź� ��µ� �� �ֵ��� �ϰ� ������� �Է¿� ���ؼ� ���α׷��� ����Ǵ� ����� ������ �ִ� ������ ��� ���α׷� �ۼ��ϼ���
//		1. ���� ���� �Է�
//		2. ����� �ܼ� �Է�
//		3. next() : ����Ű�� �Էµɶ����� �Էµ� �����͸� ���ڿ��� �Է¹���
//		4. ���ڿ� �� : ���ڿ�����.equals("���� ���ڿ�");
//		String a = "���ڿ�";
//		a.equals("���ڿ�");
		
		Scanner sc = new Scanner(System.in);
		int dan = 0; // �ܼ� �Է� �޴� ����
		String exit = ""; // ���� ���� �ޱ� ���� ����
		
//		���α׷� ���� �� �ѹ� ����ϴ� ����
		System.out.println("������ ��� ���α׷� �Դϴ�.");
		
//		���α׷��� ���� �κ�
		while (true) {
//			***** �������� ����ϱ� ���� ���� *****
//			������ ����� ���� �ܼ� �Է� �κ�
			System.out.print("����� �ܼ��� �Է����ּ��� : ");
			dan = sc.nextInt(); // ����� �Է�(����)
			int count = 1;
			
//			���� ������ ��ºκ�
			while (count < 10) {
				System.out.println(dan + " * " + count + " = " + dan * count);
				
				count++; // ������
			}
//			***** �������� ����ϱ� ���� ���� *****
			
//			***** ���α׷��� �����ϱ� ���� ���� *****
			System.out.print("���α׷��� �����ϰڽ��ϱ�?(y/n)");
			exit = sc.next(); // ����� �Է� (y/n)
			
//			equals() : ������ ���ڿ��� ��� true ���, �ٸ� ��� false ���
			if (exit.equals("y")) {
				System.out.println("���α׷��� �����մϴ�.");
				break;
			}
//			***** ���α׷��� �����ϱ� ���� ���� *****
		}
		
		sc.close();
	}
}
