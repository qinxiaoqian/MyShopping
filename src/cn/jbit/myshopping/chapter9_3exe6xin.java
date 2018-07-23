package cn.jbit.myshopping;

import java.util.Scanner;

public class chapter9_3exe6xin {
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.print("请输入菱形行数：");
		int rows=input.nextInt();
		while(rows%2==0) {
			System.out.print("请输入奇数：");
			rows=input.nextInt();
		}
		int rowMiddle=(rows+1)/2;
		for(int i=1;i<=rowMiddle;i++) {
			for(int j=1;j<=rowMiddle-i;j++) {
				System.out.print(" ");
				
			}
			for(int k=1;k<=2*i-1;k++) {
				System.out.print("*");
				
			}
			System.out.print("\n");	
			
		}
		for(int i=rowMiddle+1;i<=rows;i++) {
			for(int j=1;j<=i-rowMiddle;j++) {
				System.out.print(" ");
				
			}
			for(int k=1;k<=2*rowMiddle-1-(i-rowMiddle)*2;k++) {
				System.out.print("*");
			}
			System.out.print("\n");	
			
		}
			
				
	}

}
