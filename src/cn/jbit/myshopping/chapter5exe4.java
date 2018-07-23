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
			System.out.println("请输入一个整数（输入0结束）:");
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
		System.out.println("最大值是："+max);
		System.out.println("最小值是："+min);	
	}

}
