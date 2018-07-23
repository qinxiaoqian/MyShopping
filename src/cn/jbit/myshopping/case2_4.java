package cn.jbit.myshopping;

import java.util.Scanner;

public class case2_4 {
	
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.print("请输入语文分数：");
		int score1= input.nextInt();
		System.out.print("请输入数学分数：");
		int score2= input.nextInt();
		System.out.print("请输入英语分数：");
		int score3= input.nextInt();
		int cha=score1-score2;
		double avg=(score1+score2+score3)/3;
		System.out.println("两门成绩之差="+cha);
		System.out.println("三门成绩平均值="+avg);
			
	}

}
