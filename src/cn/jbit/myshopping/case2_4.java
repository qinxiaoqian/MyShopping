package cn.jbit.myshopping;

import java.util.Scanner;

public class case2_4 {
	
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.print("���������ķ�����");
		int score1= input.nextInt();
		System.out.print("��������ѧ������");
		int score2= input.nextInt();
		System.out.print("������Ӣ�������");
		int score3= input.nextInt();
		int cha=score1-score2;
		double avg=(score1+score2+score3)/3;
		System.out.println("���ųɼ�֮��="+cha);
		System.out.println("���ųɼ�ƽ��ֵ="+avg);
			
	}

}
