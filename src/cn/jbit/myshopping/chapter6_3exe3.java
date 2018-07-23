package cn.jbit.myshopping;

import java.util.Scanner;

public class chapter6_3exe3 {
	public static void main(String[] args) {
		String name;
		int num,i;
		Scanner input=new Scanner(System.in);
		for(i=2;i>=0;i--) {
		    System.out.println("请输入用户名：");
		    name=input.next();
		    System.out.println("请输入密码：");
		    num=input.nextInt();
		    if("jim".equals(name)&&num==123456) {
		    	System.out.println("欢迎登录MyShopping系统！");
		    	break;
		    }else {
		    	if(i!=0)
		    		System.out.println("输入错误！您还有"+i+"次机会！");
		    	else
		    		System.out.println("对不起，您三次均输入错误！");
		    }
		}
		
		
	}

}
