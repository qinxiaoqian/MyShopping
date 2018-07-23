package cn.jbit.myshopping;

import java.util.Scanner;

public class chapter4exercise2 {
	public static void main(String[] args) {
		double money=5000;
		System.out.print("请输入您出行的月份:");
		Scanner input=new Scanner(System.in);
		int month=input.nextInt();
		input.reset();
		int plane;
		System.out.print("请问您选择头等舱还是经济舱？头等舱输入1，经济舱输入2:");
		plane=input.nextInt();
		input.close();
		if(month>=4&&month<=10) {
			if(plane==1) {
				money=0.9*money;
			}else if(plane==2) {
				money=0.8*money;
			}
			
			
		}else if((month<=3&&month>=1)||month==11||month==12) {
			if(plane==1) {
				money=0.5*money;
			}else if(plane==2) {
				money=0.4*money;
			}
			
			
		}
		System.out.println("您的机票价格为："+money);
		
	}

}
