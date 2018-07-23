package cn.jbit.myshopping;

import java.util.Scanner;

public class case4_2 {
	public static void main(String[] args) {
		int score;
		Scanner input=new Scanner(System.in);
		System.out.print("请输入考试成绩：");
		score=input.nextInt();
		if(score>=90) {
			System.out.print("优秀");
		}else if(score>=80&&score<90) {
			System.out.print("良好");
		}else if(score>=60&&score<80) {
			System.out.print("中等");
		}else {
			System.out.print("差");
		}
		
	}

}
