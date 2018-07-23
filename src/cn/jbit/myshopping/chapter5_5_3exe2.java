package cn.jbit.myshopping;

import java.util.Scanner;

import java.util.Scanner;

public class chapter5_5_3exe2 {
	public static void main(String[] args) {
		 int number=0;
		 
		 System.out.println("欢迎使用MyShopping管理系统");
		 System.out.println("");
		 System.out.println("***********************");
		 System.out.println("\t1.客户信息管理");
		 System.out.println("\t2.购物结算");
		 System.out.println("\t3.真情回馈");
		 System.out.println("\t4.注销");
		 System.out.println("***********************");
		 System.out.println("");
//		 do {
//			 System.out.println("请选择，输入数字："); 
//			 number=input.nextInt();
//			 
//		 }
//		 
//		String answer="";
//	    Scanner input=new Scanner(System.in);
//		
		 boolean flag;
		 System.out.print("请选择输入数字：");
		 Scanner input=new Scanner(System.in);
		 do {
			 flag = false;
			 int no = input.nextInt();
			 input.reset();
			 switch(no) {
			 case 1:
				 System.out.println("执行客户信息管理");
				 break;
			 case 2:
				 System.out.println("执行购物结算");
				 break;
			 case 3:
				 System.out.println("执行真情回馈");
				 break;
			 case 4:
				 System.out.println("执行注销");
				 break;
			 default:
				 System.out.print("输入错误，请重新输入数字：");
				 flag=true;
			 }
		 } while(flag);
		 System.out.println("\n程序结束");
	}	 


}
