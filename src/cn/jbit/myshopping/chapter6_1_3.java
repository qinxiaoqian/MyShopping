package cn.jbit.myshopping;

import java.util.Scanner;

public class chapter6_1_3 {
	public static void main(String[] args) {
		int c;
		Scanner input=new Scanner(System.in);
		System.out.println("������һ��ֵ");
		c=input.nextInt();
		System.out.println("�������ֵ����������¼ӷ���:");
		for(int i=0,j=c;i<=c;i++,j--) {
			//System.out.println(i+"+"+j+"="+(i+j));
			System.out.println(String.format("%d+%d=%d", i, j, i+j));
			
		} 
		
	}

}
