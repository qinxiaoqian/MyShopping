package cn.jbit.myshopping;

import java.util.Scanner;

public class chapter8_2_2exe4 {
	public static void main(String[] args) {
		String name=null;
		int number=0;
		int cardNo=0;
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
		System.out.println("请填写个人注册信息");
		System.out.print("用户名：");
		name=input.next();
		System.out.print("密码：");
		number=input.nextInt();
		System.out.println();
		System.out.println("注册成功，请记住您的会员卡号");
		System.out.println("用户名\t密码\t会员卡号");
		int max=9999;
		int min=1000;
		cardNo=(int)(Math.random()*(max-min))+min;
		System.out.println(name+"\t"+number+"\t"+cardNo);
		System.out.println("继续吗?(y/n)");
		String answer=input.next();
		if("n".equals(answer)) {
			System.out.println();
			System.out.println("系统退出，谢谢使用！");
			
		}
		if("y".equals(answer)) {
			System.out.println();
			System.out.println("系统退出，谢谢使用！");
			
		}
	}	
	
	public static void main2(String[] args) {
		boolean cont = false;
		do {
			//TODO: 1. 显示菜单，选择编号
			int tag = 0;
			//TODO: 2 进入不同分支
			switch(tag) {
			case 1:
				//TODO: 3 注册用户
				
				break;
			case 2:
				boolean err3times = true;
				for(int i=0;i<3;i++) {
					//TODO: 4.1  输入用户名密码
					
					//TODO: 4.2 判断是否正确
					if(true) {
						//TODO: 4.3 正确跳出循环
						err3times = false;
						break;
					} else {
						//TODO: 4.4  不正确继续输入用户名密码
						
					}
				}
				if(err3times) {
					break;
				}
				break;
			case 3:
				
				break;
			}
			//TODO: 判断是否继续
			
		} while(cont);
		System.out.println();
	}

}
