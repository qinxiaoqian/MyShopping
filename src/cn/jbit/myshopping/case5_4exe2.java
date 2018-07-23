package cn.jbit.myshopping;

import java.util.Scanner;

public class case5_4exe2 {
	public static void main(String[] args) {
		System.out.println("MyShopping¹ÜÀíÏµÍ³>¹ºÎï½áËã");
		System.out.println("*******************");
		System.out.println("ÇëÑ¡Ôñ¹ºÂòµÄÉÌÆ·±àºÅ£º");
		System.out.println("1.TĞô\t2.ÍøÇòĞ¬\t3.ÍøÇòÅÄ");
		System.out.println("*******************");
		Scanner input=new Scanner(System.in);
//		System.out.println("ÇëÊäÈëÉÌÆ·±àºÅ£º");
//		int number=input.nextInt();
//		switch(number) {
//		case 1:
//			 System.out.println("TĞô\t$245");
//			 break;
//		case 2:
//			 System.out.println("ÍøÇòĞ¬\t$570");
//			 break;
//		case 3:
//			 System.out.println("ÍøÇòÅÄ\t$320");
//			 break;
//	    default: System.out.println("ÊäÈë´íÎó£¡");
//		}
//		
//		System.out.println("ÊÇ·ñ¼ÌĞø£¨y/n£©");
		String answer="y";
		while("y".equals(answer)) {
			System.out.println("ÇëÊäÈëÉÌÆ·±àºÅ£º");
			int number=input.nextInt();
			switch(number) {
			case 1:
				 System.out.println("TĞô\t$245");
				 break;
			case 2:
				 System.out.println("ÍøÇòĞ¬\t$570");
				 break;
			case 3:
				 System.out.println("ÍøÇòÅÄ\t$320");
				 break;
		    default: System.out.println("ÊäÈë´íÎó£¡");
			}
			System.out.println("ÊÇ·ñ¼ÌĞø£¨y/n£©");
			answer=input.next();
		}
		
		System.out.println("½áÊø");
	}

}
