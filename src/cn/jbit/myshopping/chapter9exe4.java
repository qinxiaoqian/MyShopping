package cn.jbit.myshopping;

import java.util.Scanner;

public class chapter9exe4 {
	public static void main(String[] args) {
		int sum=0;
		int count=0;
		double avg;
		int classNum=3;
		int[] scores=new int[4];
		Scanner input=new Scanner(System.in);
		for(int i=0;i<3;i++) {
			System.out.println("�����"+(i+1)+"��ɼ�");
			for(int j=0;j<4;j++) {
				System.out.print("�����"+(j+1)+"��ͬѧ�ɼ���");
				scores[j]=input.nextInt();
				if(scores[j]>85) {
					sum=sum+scores[j];
					count++;
				}	
				
			}
		}
		avg=1.0*sum/count;
		System.out.print("����85��ͬѧ��ƽ����Ϊ��"+avg);
	}

}
