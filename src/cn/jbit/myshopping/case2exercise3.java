package cn.jbit.myshopping;

import java.util.Scanner;

public class case2exercise3 {
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("请输入本金:");
		double moneyi=input.nextDouble();
		double moneyf1=0.0225*moneyi+moneyi;
		double moneyf2=0.027*2*moneyi+moneyi;
		double moneyf3=0.0324*3*moneyi+moneyi;
		double moneyf5=0.036*5*moneyi+moneyi;
		System.out.println("本金为:"+moneyi);
		System.out.println("\n");
		System.out.println("存取一年后的本息是:"+moneyf1);
		System.out.println("\n");
		System.out.println("存取两年后的本息是:"+moneyf2);
		System.out.println("\n");
		System.out.println("存取三年后的本息是:"+moneyf3);
		System.out.println("\n");
		System.out.println("存取五年后的本息是:"+moneyf5);
		
		
	}

}
