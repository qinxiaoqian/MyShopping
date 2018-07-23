package cn.jbit.myshopping;

import java.util.Scanner;

public class chapter6_1_4 {
	public static void main(String[] args) {
		int i;
		int age;
		int young=0;
		double percent;
		Scanner input=new Scanner(System.in);
		for(i=0;i<10;i++) {
			System.out.println("请输入第"+(i+1)+"位顾客的年龄:");
			age=input.nextInt();
			if(age<=30) {
				young=young+1;
				
			}
		}
		percent=young/10.0;
		System.out.println("30岁以下的比例是："+percent*100+"%");
		System.out.println("30岁以上的比例是："+(1-percent)*100+"%");
		
		
	}

}
