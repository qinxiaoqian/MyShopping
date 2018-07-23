package cn.jbit.myshopping;

import java.util.Scanner;

public class chapter6_3 {
	public static void main(String[] args) {
		int num,i;
		String birthday;
		int score;
		Scanner input=new Scanner(System.in);
		System.out.println("MyShopping管理系统>客户信息管理>添加客户信息");
		for(i=0;i<3;i++) {
		    System.out.println();
		    System.out.println("请输入会员号(<4位整数>)：");
		    num=input.nextInt();
		    System.out.println("请输入会员生日(月/日<用两位整数表示>)：");
		    birthday=input.next();
		    System.out.println("请输入会员积分：");
		    score=input.nextInt();
		    System.out.println("您录入的会员信息是：");
		    System.out.println(num+"\t"+birthday+"\t"+score);
		    if(num>=1000&&num<=9999) {
		    	continue;
		    }
		    System.out.println("客户号"+num+"是无效会员号！");
		    System.out.println("录入信息失败");
		}
		System.out.println("程序结束！");
		
		
		
	}

}
