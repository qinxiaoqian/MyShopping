package cn.jbit.myshopping;

import java.util.Scanner;

public class case4_4_2 {
	public static void main(String[] args) {
		int score;
		Scanner input=new Scanner(System.in);
		System.out.print("�������Ա����:");
		score=input.nextInt();
		double discount;
		System.out.print("�û�Ա���ܵ��ۿ��ǣ�");
		if(score<2000) {
			System.out.println("0.9");
			
		}else if(score<4000) {
			System.out.println("0.8");
			
		}else if(score<8000) {
			System.out.println("0.7");
			
		}else{
			System.out.println("0.6");
			
		}
		
	}

}
