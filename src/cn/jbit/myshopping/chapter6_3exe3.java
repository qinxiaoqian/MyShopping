package cn.jbit.myshopping;

import java.util.Scanner;

public class chapter6_3exe3 {
	public static void main(String[] args) {
		String name;
		int num,i;
		Scanner input=new Scanner(System.in);
		for(i=2;i>=0;i--) {
		    System.out.println("�������û�����");
		    name=input.next();
		    System.out.println("���������룺");
		    num=input.nextInt();
		    if("jim".equals(name)&&num==123456) {
		    	System.out.println("��ӭ��¼MyShoppingϵͳ��");
		    	break;
		    }else {
		    	if(i!=0)
		    		System.out.println("�������������"+i+"�λ��ᣡ");
		    	else
		    		System.out.println("�Բ��������ξ��������");
		    }
		}
		
		
	}

}
