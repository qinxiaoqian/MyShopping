package cn.jbit.myshopping;

import java.util.Scanner;

public class chapter7_4_3 {
	public static void main(String[] args) {
		int[] scores=new int[5];
		int[] scorenew=new int[5];
		Scanner input=new Scanner(System.in);
		System.out.println("������5λ��Ա�Ļ���");
		for(int i=0;i<scores.length;i++) {
			System.out.print("��"+(i+1)+"λ��Ա���֣�");
			scores[i]=input.nextInt();
			scorenew[i]=scores[i]+500;
			
		}
		System.out.println("");
		System.out.println("���\t\t��ʷ����\t\t�������");
		for(int i=0;i<scores.length;i++) {
			System.out.println((i+1)+"\t\t"+scores[i]+"\t\t"+scorenew[i]);
		}
		
		
		
	}

}
