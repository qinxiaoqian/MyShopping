package cn.jbit.myshopping;

import java.util.Scanner;

public class chapter9_2_1 {
	public static void main(String[] args) {
		int[] scores=new int[4];
		int sum=0;
		double avg;
		System.out.println("��������λѧԱ�ĳɼ�");
		Scanner input=new Scanner(System.in);
		for(int i=0;i<scores.length;i++) {
			
			System.out.print("��"+(i+1)+"λѧԱ�ĳɼ�");
			scores[i]=input.nextInt();
			
		}
		
		
		
		for(int i=0;i<scores.length;i++) {
			
			sum=sum+scores[i];
		}
		avg= 1.0*sum/scores.length;
		System.out.println("����ѧԱ��ƽ�����ǣ�"+avg);
		}

}
