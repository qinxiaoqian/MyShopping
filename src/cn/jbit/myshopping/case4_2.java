package cn.jbit.myshopping;

import java.util.Scanner;

public class case4_2 {
	public static void main(String[] args) {
		int score;
		Scanner input=new Scanner(System.in);
		System.out.print("�����뿼�Գɼ���");
		score=input.nextInt();
		if(score>=90) {
			System.out.print("����");
		}else if(score>=80&&score<90) {
			System.out.print("����");
		}else if(score>=60&&score<80) {
			System.out.print("�е�");
		}else {
			System.out.print("��");
		}
		
	}

}
