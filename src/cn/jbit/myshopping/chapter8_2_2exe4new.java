package cn.jbit.myshopping;

import java.util.Scanner;

public class chapter8_2_2exe4new {
	public static void main(String[] args) {
		String answer=null;
		String name=null;
		String name1=null;
		
		String number=null;
		String number1=null;

		int cardNo;
		int max=9999;
		int min=1000;
	
		
		do {
			System.out.println("*****欢迎进入奖客富翁系统*****");
		    System.out.println("\t1.注册");
		    System.out.println("\t2.登录");
		    System.out.println("\t3.抽奖");
		    System.out.println("*************************");
		    System.out.print("请选择菜单");
		    Scanner input=new Scanner(System.in);
			int num=input.nextInt();
			if(num==1) {
				System.out.println("[奖客富翁系统>注册]");
				System.out.println("请填写个人注册信息");
				System.out.print("用户名：");
				name=input.next();
				System.out.print("密码：");
				number=input.next();
				System.out.println();
				System.out.println("注册成功，请记住您的会员卡号");
				System.out.println("用户名\t密码\t会员卡号");
				
				cardNo=(int)(Math.random()*(max-min))+min;
				System.out.println(name+"\t"+number+"\t"+cardNo);
				
			}else if(num==2) {
				
				System.out.println("[奖客富翁系统>登录]");
			
				for(int i=0;i<3;i++) {
					System.out.println("请输入用户名：");
					name1=input.next();
					System.out.println("请输入密码：");
					number1=input.next();
					if((name1.equals(name))&&(number1.equals(number))){
						
						System.out.println();
				        System.out.println("欢迎您："+name1);
				        break;
					}else {
						if(i==2) {
							System.out.println("已输错三次，程序退出！");
							System.exit(0);
						} else {
							System.out.println("还有"+(2-i)+"次机会：");
						}
						
					}
				}
					
			}else if(num==3) {
				boolean lucky=false;
				System.out.println("[奖客富翁系统>抽奖]");
				System.out.println("请输入您的卡号：");
				cardNo=input.nextInt();
				System.out.println();
				int[] luckynumbers=new int[5];
				System.out.print("本日的幸运数字为： ");
				for(int i=0;i<luckynumbers.length;i++) {
					luckynumbers[i]=(int)(Math.random()*(max-min))+min;
					System.out.print(luckynumbers[i]+" ");
					if(luckynumbers[i]==cardNo) {
						lucky=true;
					}
				}
				if(lucky) {
					System.out.println("恭喜您是本日的幸运会员！");
				}else {
					System.out.println("抱歉！您不是本日的幸运会员！");
				}
					
					
				
				
				
			}
			System.out.println("继续吗?(y/n)");
			answer = input.next();
		}while("y".equals(answer));
		System.out.println();
		System.out.println("系统退出，谢谢使用！");
		
		
	}

}
