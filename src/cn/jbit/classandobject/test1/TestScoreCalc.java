package cn.jbit.classandobject.test1;

import java.util.Scanner;

public class TestScoreCalc {
	public static void main(String[] args) {
		ScoreCalc scoreCalc=new ScoreCalc();
		Scanner input=new Scanner(System.in);
		System.out.println("������Java�ɼ�:");
		scoreCalc.scoreJ=input.nextInt();
		System.out.println("������C#�ɼ�:");
		scoreCalc.scoreC=input.nextInt();
		System.out.println("������DB�ɼ�:");
		scoreCalc.scoreDB=input.nextInt();
		
		scoreCalc.showSum();
		scoreCalc.showAvg();
		
		
	}
	
	
	

}
