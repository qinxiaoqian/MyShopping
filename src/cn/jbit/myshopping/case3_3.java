package cn.jbit.myshopping;

import java.util.Scanner;

public class case3_3 {
	
	public static void main(String[] args) {
		
		Scanner input=new Scanner(System.in);
		System.out.println("输入张浩的java成绩:");
		double score=input.nextDouble();
		if(score>98) {
			System.out.println("老师说:不错,奖励一个MP4！");
			
		}
	}

}
