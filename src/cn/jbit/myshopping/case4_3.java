package cn.jbit.myshopping;

import java.util.Scanner;

public class case4_3 {
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.print("��������������");
		double score=input.nextDouble();
		System.out.print("�������Ա�");
		String gender=input.next();
		System.out.println("------" + gender+"-------");
		if(score<10) {
			if(gender.equals("��")) {
				System.out.print("����������");
			}else if(gender.equals("Ů")) {
				System.out.print("����Ů����");
			}
		}else {
			System.out.print("��̭��");
		}
	}

}
