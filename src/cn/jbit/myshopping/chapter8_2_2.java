package cn.jbit.myshopping;

import java.util.Scanner;

public class chapter8_2_2 {
	public static void main(String[] args) {
		System.out.println("*****��ӭ���뽱�͸���ϵͳ*****");
		System.out.println("\t1.ע��");
		System.out.println("\t2.��¼");
		System.out.println("\t3.�齱");
		System.out.println("*************************");
		System.out.print("��ѡ��˵�");
		Scanner input=new Scanner(System.in);
		int num=input.nextInt();
		switch(num) {
		case 1:
			System.out.println("[���͸���ϵͳ>ע��]");
			break;
		case 2:
			System.out.println("[���͸���ϵͳ>��¼]");
			break;
		case 3:
			System.out.println("[���͸���ϵͳ>�齱]");
			break;
		default:
			System.out.println("������������");
			
		}
	}

}
