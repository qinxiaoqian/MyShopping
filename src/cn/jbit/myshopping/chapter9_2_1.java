package cn.jbit.myshopping;

import java.util.Scanner;

public class chapter9_2_1 {
	public static void main(String[] args) {
		int[] scores=new int[4];
		int sum=0;
		double avg;
		System.out.println("请输入四位学员的成绩");
		Scanner input=new Scanner(System.in);
		for(int i=0;i<scores.length;i++) {
			
			System.out.print("第"+(i+1)+"位学员的成绩");
			scores[i]=input.nextInt();
			
		}
		
		
		
		for(int i=0;i<scores.length;i++) {
			
			sum=sum+scores[i];
		}
		avg= 1.0*sum/scores.length;
		System.out.println("参赛学员的平均分是："+avg);
		}

}
