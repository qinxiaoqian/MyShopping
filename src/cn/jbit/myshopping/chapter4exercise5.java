package cn.jbit.myshopping;

import java.util.Scanner;

public class chapter4exercise5 {
	public static void main(String[] args) {
		double money=5000;
		System.out.print("�����������е��·�:");
		Scanner input=new Scanner(System.in);
		int month=input.nextInt();
		input.reset();
		int plane;
		System.out.print("������ѡ��ͷ�Ȳջ��Ǿ��òգ�ͷ�Ȳ�����1�����ò�����2:");
		plane=input.nextInt();
		input.close();
		switch(month) {
		case 4:
		case 5:
		case 6:
		case 7:
		case 8:
		case 9:	
		case 10:
		
			if(plane==1) {
				money=0.9*money;
			}else if(plane==2) {
				money=0.8*money;
			}
		    break;
			
			
		case 1:
		case 2:
		case 3:
		case 11:
		case 12:
			if(plane==1) {
				money=0.5*money;
			}else if(plane==2) {
				money=0.4*money;
			}
			break;
			
		}
		System.out.println("���Ļ�Ʊ�۸�Ϊ��"+money);
		
	}

}
