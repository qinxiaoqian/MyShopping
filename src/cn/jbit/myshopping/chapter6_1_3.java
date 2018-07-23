package cn.jbit.myshopping;

import java.util.Scanner;

public class chapter6_1_3 {
	public static void main(String[] args) {
		int c;
		Scanner input=new Scanner(System.in);
		System.out.println("请输入一个值");
		c=input.nextInt();
		System.out.println("根据这个值可以输出以下加发表:");
		for(int i=0,j=c;i<=c;i++,j--) {
			//System.out.println(i+"+"+j+"="+(i+j));
			System.out.println(String.format("%d+%d=%d", i, j, i+j));
			
		} 
		
	}

}
