package cn.jbit.myshopping;

import java.util.Scanner;

public class chapter4exercise {
	public static void main(String[] args) {
		System.out.println("请输入成绩");
		Scanner input=new Scanner(System.in);
		
		double score=input.nextDouble();
		if(score==100) {
			System.out.println("爸爸给买车");
		}else if(score>=90){
			System.out.println("妈妈给买笔记本电脑");
		}else if(score>=60){
			System.out.println("妈妈给买手机");
		}else{
			System.out.println("没有礼物");
		}		
	}

}
