package cn.jbit.myshopping;

import java.util.Scanner;

public class case4_4 {
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("请输入是否是会员：是（y）/否（其他字符）");
		String answer=input.next();
		double pay;
		double payf;
		System.out.println("请输入购物金额");
		pay=input.nextDouble();
		if(answer.equals("y")) {
			if(pay>=200) {
				payf=0.75*pay;
				
			}else {
				payf=0.8*pay;
			}
			
		}else {
			if(pay>=100) {
				payf=0.9*pay;
			}else {
				payf=pay;
			}
			
		}
		System.out.println("实际支付：" + payf);
	
	}

}
