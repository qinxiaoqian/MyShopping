package cn.jbit.myshopping;

import java.util.Scanner;

public class chapter6_2_1 {
	public static void main(String[] args) {
		int score=0;
		int i;
		int sum=0;
		int avg=0;
		Scanner input=new Scanner(System.in);
		for(i=0;i<5;i++) {
			System.out.println("请输入第"+(i+1)+"门成绩：");
			score=input.nextInt();
			sum=sum+score;
			if(score<0) {
				System.out.println("录入错误！"+ "");
				break;
			}
			
		}
		avg=sum/i;
		System.out.println("平均成绩为："+avg);
		
		
	}

}
