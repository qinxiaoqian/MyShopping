package cn.jbit.myshopping;

import java.util.Scanner;

public class chapter4exercise {
	public static void main(String[] args) {
		System.out.println("������ɼ�");
		Scanner input=new Scanner(System.in);
		
		double score=input.nextDouble();
		if(score==100) {
			System.out.println("�ְָ���");
		}else if(score>=90){
			System.out.println("�������ʼǱ�����");
		}else if(score>=60){
			System.out.println("��������ֻ�");
		}else{
			System.out.println("û������");
		}		
	}

}
