package cn.jbit.myshopping;

import java.util.Scanner;

public class chapter9_3exe4 {
	public static void main(String[] args) {
		int rows;
		Scanner input=new Scanner(System.in);
		System.out.print("请输入直角三角形的行数：");
		rows=input.nextInt();
		for(int i=1;i<=rows;i++) {
			for(int j=1;j<=(rows+1-i);j++) {
				System.out.print("*");
			}
			System.out.print("\n");
		}
	}

}
