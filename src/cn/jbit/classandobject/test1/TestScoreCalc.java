package cn.jbit.classandobject.test1;

import java.util.Scanner;

public class TestScoreCalc {
	public static void main(String[] args) {
		ScoreCalc scoreCalc=new ScoreCalc();
		Scanner input=new Scanner(System.in);
		System.out.println("请输入Java成绩:");
		scoreCalc.scoreJ=input.nextInt();
		System.out.println("请输入C#成绩:");
		scoreCalc.scoreC=input.nextInt();
		System.out.println("请输入DB成绩:");
		scoreCalc.scoreDB=input.nextInt();
		
		scoreCalc.showSum();
		scoreCalc.showAvg();
		
		
	}
	
	
	

}
