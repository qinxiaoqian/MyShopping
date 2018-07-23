package cn.jbit.classandobject.test1;

import java.util.Scanner;

public class InitialCalculator {
	public static void main(String[] args) {
		
		Calculator cal=new Calculator();
		Scanner input=new Scanner(System.in);
		System.out.print("输入第一个整数：");
		cal.a=input.nextInt();
		System.out.print("输入运算符：");
		cal.c=input.next();
		System.out.print("输入第二个整数：");
		cal.b=input.nextInt();
		cal.show();
	}

}
