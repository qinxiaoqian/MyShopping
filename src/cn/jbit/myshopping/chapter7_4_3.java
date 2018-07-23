package cn.jbit.myshopping;

import java.util.Scanner;

public class chapter7_4_3 {
	public static void main(String[] args) {
		int[] scores=new int[5];
		int[] scorenew=new int[5];
		Scanner input=new Scanner(System.in);
		System.out.println("请输入5位会员的积分");
		for(int i=0;i<scores.length;i++) {
			System.out.print("第"+(i+1)+"位会员积分：");
			scores[i]=input.nextInt();
			scorenew[i]=scores[i]+500;
			
		}
		System.out.println("");
		System.out.println("序号\t\t历史积分\t\t新年积分");
		for(int i=0;i<scores.length;i++) {
			System.out.println((i+1)+"\t\t"+scores[i]+"\t\t"+scorenew[i]);
		}
		
		
		
	}

}
