package cn.jbit.myshopping;

import java.util.Scanner;

public class chapter6_1 {
	public static void main(String[] args) {
		double score;
		int i;
		double sum=0;
		double avg;
		
		Scanner input=new Scanner(System.in);
		for(i=0;i<5;i++){
			System.out.println("�����"+(i+1)+"�ųɼ���");
			score=input.nextInt();
			sum=sum+score;
		}
		avg=sum/i;
		System.out.println("����ƽ����:"+avg);
		input.close();
		
		
	}

}
