package cn.jbit.myshopping;
import java.util.Scanner;
public class case3_3_3 {
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("输入java成绩:");
		int java=input.nextInt();
		System.out.println("输入音乐成绩:");
		int music=input.nextInt();
		if((java>98&&music>80)||(java==100&&music>70)) {
			System.out.println("老师说:表现不错,奖励你一个MP4!");
		}
		
	}
	

}
