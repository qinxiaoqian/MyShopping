package cn.jbit.myshopping;

import java.util.Scanner;

import java.util.Scanner;

public class chapter5_5_3exe2 {
	public static void main(String[] args) {
		 int number=0;
		 
		 System.out.println("��ӭʹ��MyShopping����ϵͳ");
		 System.out.println("");
		 System.out.println("***********************");
		 System.out.println("\t1.�ͻ���Ϣ����");
		 System.out.println("\t2.�������");
		 System.out.println("\t3.�������");
		 System.out.println("\t4.ע��");
		 System.out.println("***********************");
		 System.out.println("");
//		 do {
//			 System.out.println("��ѡ���������֣�"); 
//			 number=input.nextInt();
//			 
//		 }
//		 
//		String answer="";
//	    Scanner input=new Scanner(System.in);
//		
		 boolean flag;
		 System.out.print("��ѡ���������֣�");
		 Scanner input=new Scanner(System.in);
		 do {
			 flag = false;
			 int no = input.nextInt();
			 input.reset();
			 switch(no) {
			 case 1:
				 System.out.println("ִ�пͻ���Ϣ����");
				 break;
			 case 2:
				 System.out.println("ִ�й������");
				 break;
			 case 3:
				 System.out.println("ִ���������");
				 break;
			 case 4:
				 System.out.println("ִ��ע��");
				 break;
			 default:
				 System.out.print("��������������������֣�");
				 flag=true;
			 }
		 } while(flag);
		 System.out.println("\n�������");
	}	 


}
