package cn.jbit.myshopping;

import java.util.Scanner;

public class chapter4exercise4 {
	public static void main(String[] args) {
		System.out.println("������ɼ�");
		Scanner input=new Scanner(System.in);
		
		int score=input.nextInt();
		score=score/10;
		switch(score) {
		case 10:
			System.out.println("�ְָ���");
			break;
		case 9:
			System.out.println("�������ʼǱ�����");
			break;
		case 8:
		case 7:
		case 6:
			System.out.println("��������ֻ�");
			break;
		default:
			System.out.println("û������");
			
		}		
	}

}
