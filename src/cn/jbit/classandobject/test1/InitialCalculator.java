package cn.jbit.classandobject.test1;

import java.util.Scanner;

public class InitialCalculator {
	public static void main(String[] args) {
		
		Calculator cal=new Calculator();
		Scanner input=new Scanner(System.in);
		System.out.print("�����һ��������");
		cal.a=input.nextInt();
		System.out.print("�����������");
		cal.c=input.next();
		System.out.print("����ڶ���������");
		cal.b=input.nextInt();
		cal.show();
	}

}
