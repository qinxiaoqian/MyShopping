package cn.jbit.myshopping;

import java.util.Scanner;

public class chapter5_5_3 {
	public static void main(String[] args) {
		String answer="";
	    Scanner input=new Scanner(System.in);
		do {
			
		    System.out.println("�ϻ���д����");
		    System.out.println("�ϸ�����");
		    answer=input.next();
		    System.out.println();
		}while(!"y".equals(answer));
		 System.out.println("�ϸ�");
	}	 

	

}
