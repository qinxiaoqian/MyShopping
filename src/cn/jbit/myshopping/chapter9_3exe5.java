package cn.jbit.myshopping;

import java.util.Scanner;

public class chapter9_3exe5 {
	public static void main(String[] args) {
		int rows=0;
		Scanner input=new Scanner(System.in);
		System.out.print("请输入等腰三角形的行数：");
		rows=input.nextInt();
		for(int i=1;i<=rows;i++) {
			for(int j=1;j<=rows-i;j++) {
				System.out.print(" ");
			}
			for(int k=1;k<=2*i-1;k++) {
				System.out.print("*");
			}
			System.out.print("\n");
			
		}
		
	}

}
