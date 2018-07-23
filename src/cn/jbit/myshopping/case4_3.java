package cn.jbit.myshopping;

import java.util.Scanner;

public class case4_3 {
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.print("请输入比赛结果：");
		double score=input.nextDouble();
		System.out.print("请输入性别：");
		String gender=input.next();
		System.out.println("------" + gender+"-------");
		if(score<10) {
			if(gender.equals("男")) {
				System.out.print("进入男子组");
			}else if(gender.equals("女")) {
				System.out.print("进入女子组");
			}
		}else {
			System.out.print("淘汰！");
		}
	}

}
