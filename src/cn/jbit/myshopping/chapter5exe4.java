package cn.jbit.myshopping;

import java.util.Scanner;

public class chapter5exe4 {
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		int num=0;
		int max=Integer.MIN_VALUE;
		int min=Integer.MAX_VALUE;
		int i=0;
		do {
			System.out.println("������һ������������0������:");
			 num=input.nextInt();
			 input.reset();
			 if(num!=0 && num>max || i==0) {
				 max=num;
			 }
			 if(num!=0 && num<min || i==0) {
				 min=num;
			 }
			i++;
		}while(num>0||num<0);
		System.out.println("���ֵ�ǣ�"+max);
		System.out.println("��Сֵ�ǣ�"+min);	
	}

}
