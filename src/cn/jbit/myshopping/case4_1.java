package cn.jbit.myshopping;

import java.util.Scanner;

public class case4_1 {
	public static void main(String[] args) {
		System.out.println("�������ع������ϵͳ>�������ϵͳ");
		Scanner input=new Scanner(System.in);
		System.out.println();
		System.out.print("������4λ��Ա�ţ�");
		int custNo=input.nextInt();
		int random=(int)(Math.random()*10);
		if(custNo/100%10==random) {
			System.out.println(custNo+"�ſͻ������˿ͻ�,����MP3һ����");
		}else {
			System.out.println(custNo+"�ſͻ�,лл����֧��!");
		}
	}

}
