package cn.jbit.myshopping;

import java.util.Scanner;

public class chapter6_2_1 {
	public static void main(String[] args) {
		int score=0;
		int i;
		int sum=0;
		int avg=0;
		Scanner input=new Scanner(System.in);
		for(i=0;i<5;i++) {
			System.out.println("�������"+(i+1)+"�ųɼ���");
			score=input.nextInt();
			sum=sum+score;
			if(score<0) {
				System.out.println("¼�����"+ "");
				break;
			}
			
		}
		avg=sum/i;
		System.out.println("ƽ���ɼ�Ϊ��"+avg);
		
		
	}

}
