package cn.jbit.myshopping;

import java.util.Scanner;

public class case5_4exercise {
	public static void main(String[] args) {
		int num=0;
		int sum=0;
		
		while(num<=100) {
			sum=sum+num;
			num=num+2;
		}
		System.out.println("100以内偶数的和为："+sum);
		
	}

}
