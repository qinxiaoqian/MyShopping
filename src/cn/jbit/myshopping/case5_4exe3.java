package cn.jbit.myshopping;

import java.util.Scanner;

public class case5_4exe3 {
	public static void main(String[] args) {
		System.out.println("MyShopping管理系统>购物结算");
		System.out.println("*******************");
		System.out.println("请选择购买的商品编号：");
		System.out.println("1.T恤\t2.网球鞋\t3.网球拍");
		System.out.println("*******************");
		Scanner input=new Scanner(System.in);
		String answer="y";
		double sum = 0;
		while("y".equals(answer)) {
			System.out.println("请输入商品编号：");
			int number=input.nextInt();
			System.out.println("请输入商品数量：");
			int geshu=input.nextInt();
			String name="";
			double price=0;
			
			switch(number) {
			case 1:
				 name="T恤";
				 price=245.0; 
				 break;
			case 2:
				name="网球鞋";
				 price=570.0;
				 break;
			case 3:
				 name="网球拍";
				 price=320.0;
				 break;
		    default: System.out.println("输入错误！");
			}
			double currSum = price*geshu;	//计算本次所选商品的价格
			System.out.println(name+"￥"+price+"\t数量 "+geshu+"\t合计 "+currSum);
			sum+=currSum;	//计算之前所选商品的总价格
			System.out.println("是否继续（y/n）");
			answer=input.next();
		}
		double discount=0.8;
		double shouldpay=sum*discount;
		
		
		System.out.println("折扣："+discount);
		
		System.out.println("应付金额："+shouldpay);
		System.out.println("实付金额：");
		double realpay=input.nextDouble();
		double change=realpay-shouldpay;
		System.out.println("找钱："+change);
	}
}
