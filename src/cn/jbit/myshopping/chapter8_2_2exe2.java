package cn.jbit.myshopping;

import java.util.Scanner;

public class chapter8_2_2exe2 {
	public static void main(String[] args) {
		String answer=null;
		do {
			System.out.println("*****欢迎进入奖客富翁系统*****");
			System.out.println("\t1.注册");
			System.out.println("\t2.登录");
			System.out.println("\t3.抽奖");
			System.out.println("*************************");
			System.out.print("请选择菜单");
			Scanner input=new Scanner(System.in);
			int num=input.nextInt();
			switch(num) {
			case 1:
				System.out.println("[奖客富翁系统>注册]");
				break;
			case 2:
				System.out.println("[奖客富翁系统>登录]");
				break;
			case 3:
				System.out.println("[奖客富翁系统>抽奖]");
				break;
			default:
				System.out.println("您的输入有误！");
			}
			System.out.println("继续吗?(y/n):");
			//Scanner input=new Scanner(System.in);
			answer=input.next();
			
		}while("y".equals(answer));
		System.out.println("系统退出，谢谢使用！");
			
	}
}
	
		