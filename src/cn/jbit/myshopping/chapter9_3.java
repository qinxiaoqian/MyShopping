package cn.jbit.myshopping;

import java.util.Scanner;

public class chapter9_3 {
	public static void main(String[] args) {
		int row=0;
		Scanner input=new Scanner(System.in);
		System.out.print("请输入直角三角形的行数：");
		row=input.nextInt();
		for(int i=1;i<=row;i++) {
			for(int j=1;j<=(2*i-1);j++) {
				System.out.print("*");
				
			}
			System.out.print("\n");
		}
		
		
	}

}
