package cn.jbit.myshopping;

import java.util.Scanner;

public class case5_4exe2 {
	public static void main(String[] args) {
		System.out.println("MyShopping����ϵͳ>�������");
		System.out.println("*******************");
		System.out.println("��ѡ�������Ʒ��ţ�");
		System.out.println("1.T��\t2.����Ь\t3.������");
		System.out.println("*******************");
		Scanner input=new Scanner(System.in);
//		System.out.println("��������Ʒ��ţ�");
//		int number=input.nextInt();
//		switch(number) {
//		case 1:
//			 System.out.println("T��\t$245");
//			 break;
//		case 2:
//			 System.out.println("����Ь\t$570");
//			 break;
//		case 3:
//			 System.out.println("������\t$320");
//			 break;
//	    default: System.out.println("�������");
//		}
//		
//		System.out.println("�Ƿ������y/n��");
		String answer="y";
		while("y".equals(answer)) {
			System.out.println("��������Ʒ��ţ�");
			int number=input.nextInt();
			switch(number) {
			case 1:
				 System.out.println("T��\t$245");
				 break;
			case 2:
				 System.out.println("����Ь\t$570");
				 break;
			case 3:
				 System.out.println("������\t$320");
				 break;
		    default: System.out.println("�������");
			}
			System.out.println("�Ƿ������y/n��");
			answer=input.next();
		}
		
		System.out.println("����");
	}

}
