package cn.jbit.myshopping;

import java.util.Scanner;

public class case4_4 {
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("�������Ƿ��ǻ�Ա���ǣ�y��/�������ַ���");
		String answer=input.next();
		double pay;
		double payf;
		System.out.println("�����빺����");
		pay=input.nextDouble();
		if(answer.equals("y")) {
			if(pay>=200) {
				payf=0.75*pay;
				
			}else {
				payf=0.8*pay;
			}
			
		}else {
			if(pay>=100) {
				payf=0.9*pay;
			}else {
				payf=pay;
			}
			
		}
		System.out.println("ʵ��֧����" + payf);
	
	}

}
