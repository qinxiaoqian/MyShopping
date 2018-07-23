package cn.jbit.myshopping;

import java.util.Scanner;

public class chapter7_2_3exe2 {
	public static void main(String[] args) {
		double[] pay=new double[5];
		double sum=0;
		for(int i=0;i<5;i++){
			Scanner input=new Scanner(System.in);
			System.out.print("请输入第"+(i+1)+"笔购物金额：");
			pay[i]=input.nextDouble();
			sum=sum+pay[i];
					
		}
		System.out.println();
		System.out.println("序号\t\t金额（元）");
		for(int i=0;i<5;i++){
			System.out.println((i+1)+"\t\t"+pay[i]);
		}
		System.out.print("总金额\t\t"+sum);		
		
		
	}

}
