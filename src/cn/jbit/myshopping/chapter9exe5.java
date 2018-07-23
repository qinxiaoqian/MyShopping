package cn.jbit.myshopping;

import java.util.Scanner;

public class chapter9exe5 {
	public static void main(String[] args) {
		int passwordright=111111;
		int password = -1;
		int amount;
		Scanner input=new Scanner(System.in);
		for(int i=1;i<=3;i++){
			System.out.print("请输入密码：");
			password=input.nextInt();
			if(password!=passwordright) {
				continue;
				
			}
			boolean flag=true;
			System.out.print("请输入金额：");
			while(flag) {
				amount=input.nextInt();
				if(amount>=0&&amount<=1000&&amount%100==0) {
					System.out.println("您取了"+amount+"元");
					flag = false;
				}else {
					System.out.print("您输入的金额不合法，请重新输入：");
				}
			}
			if(!flag) break;
		}
		if(password!=passwordright) {
			System.out.println("密码错误，请取卡！");
		}else {
			System.out.println("交易完成，请取卡!");
			
		}
		
		
		
		
	}

}
