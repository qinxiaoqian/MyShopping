package cn.jbit.myshopping;

import java.util.Scanner;

public class case2exercise3 {
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("�����뱾��:");
		double moneyi=input.nextDouble();
		double moneyf1=0.0225*moneyi+moneyi;
		double moneyf2=0.027*2*moneyi+moneyi;
		double moneyf3=0.0324*3*moneyi+moneyi;
		double moneyf5=0.036*5*moneyi+moneyi;
		System.out.println("����Ϊ:"+moneyi);
		System.out.println("\n");
		System.out.println("��ȡһ���ı�Ϣ��:"+moneyf1);
		System.out.println("\n");
		System.out.println("��ȡ�����ı�Ϣ��:"+moneyf2);
		System.out.println("\n");
		System.out.println("��ȡ�����ı�Ϣ��:"+moneyf3);
		System.out.println("\n");
		System.out.println("��ȡ�����ı�Ϣ��:"+moneyf5);
		
		
	}

}
