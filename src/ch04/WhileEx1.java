package ch04;

import java.util.Scanner;

public class WhileEx1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		109������ ���� �� �Է��� �ܼ��� ������ ����ϱ�
		
		System.out.println("----- While ���� -----");
		
		int num = 1;
		int sum = 0;
		
		while (num <= 10) {
			sum += num;
			
			num++;
		}
		System.out.println("1���� 10������ ���� " + sum + "�Դϴ�.");
		
		System.out.println("----- while�� ������ ����� -----");
		
		Scanner sc = new Scanner(System.in);
		int dan = 0;
		
		System.out.print("����� �ܼ��� �Է��ϼ��� : ");
		dan = sc.nextInt();
		
		int count = 1;
		while (count < 10) {
			System.out.println(dan + " * " + count + " = " + dan * count);
			
			count++;
		}
		
		sc.close();
	}

}
