package ch04;

public class IfEx3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		������ �����ϰ� ����ϱ� ���� �����͸� �ʱ�ȭ���� ���� ��� ������ �ʴ� ����� ��µ� �� �ִ�.
//		��Ȯ�� ����� ��µ� �� �ֵ��� ��� ���� �ݵ�� �ʱ�ȭ �۾��� �����ؾ� ��
		int age = 6; // ���� �� �ʱ�ȭ
		int charge; // ���� �� �ʱ�ȭ���� ����, ���� ��
		
		if (age < 8) {
			charge = 100; // �����͸� �����Ͽ� ������ �ʱ�ȭ ��
			System.out.println("���� �� �Ƶ��Դϴ�.");
		}
		else if (age < 14) {
			charge = 2000;
			System.out.println("�ʵ��л��Դϴ�.");
		}
		else if (age < 20) {
			charge = 2500;
			System.out.println("��, ����л��Դϴ�.");
		}
		else {
			charge = 3000;
			System.out.println("�Ϲ����Դϴ�.");
		}
		
		System.out.println("������ " + charge + "�� �Դϴ�.");
		
		
		System.out.println("----- if���� ������ ������� ��� -----");
		
		age = 6;
		
		if (age < 8) {
			charge = 1000;
			System.out.println("������ �Ƶ� �Դϴ�.");
		}
		
		if (age <14) {
			charge = 2000;
			System.out.println("�ʵ��л� �Դϴ�.");
		}
		
		if (age < 20) {
			charge = 2500;
			System.out.println("��, ����л� �Դϴ�.");
		}
		else {
			charge = 3000;
			System.out.println("�Ϲ��� �Դϴ�.");
		}
		
		System.out.println("������ " + charge + "�� �Դϴ�.");
	}
}
