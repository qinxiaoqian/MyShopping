package cn.jbit.myshopping;

import java.util.Scanner;

public class chapter4exercise4 {
	public static void main(String[] args) {
		System.out.println("请输入成绩");
		Scanner input=new Scanner(System.in);
		
		int score=input.nextInt();
		score=score/10;
		switch(score) {
		case 10:
			System.out.println("爸爸给买车");
			break;
		case 9:
			System.out.println("妈妈给买笔记本电脑");
			break;
		case 8:
		case 7:
		case 6:
			System.out.println("妈妈给买手机");
			break;
		default:
			System.out.println("没有礼物");
			
		}		
	}

}
