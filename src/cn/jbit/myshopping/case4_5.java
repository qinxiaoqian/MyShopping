package cn.jbit.myshopping;

import java.util.Scanner;

public class case4_5 {
	public static void main(String[] args) {
		System.out.println("��ӭʹ���������ع������ϵͳ1.0��");
		System.out.println();
		System.out.println("1.��¼ϵͳ");
		System.out.println();
		System.out.println("2.�˳�");
		System.out.println();
		System.out.println("**********************************");
		System.out.println();
		System.out.print("��ѡ���������֣�");
		Scanner input=new Scanner(System.in);
		int num=input.nextInt();
		switch(num) {
		case 1:
			
			System.out.println("1.�ͻ���Ϣ����");
			System.out.println("2.�������");
			System.out.println("3.�������");
			System.out.println("4.ע��");
			
			break;
		case 2:
			System.out.println("лл����ʹ�ã�");
			break;
		default:
			
			System.out.println("��������ȷ���֣�");
			break;
			
		}
		
		
		
	}

}
