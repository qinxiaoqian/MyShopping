package cn.jbit.myshopping;

import java.util.Scanner;

public class case5_4exe3 {
	public static void main(String[] args) {
		System.out.println("MyShopping����ϵͳ>�������");
		System.out.println("*******************");
		System.out.println("��ѡ�������Ʒ��ţ�");
		System.out.println("1.T��\t2.����Ь\t3.������");
		System.out.println("*******************");
		Scanner input=new Scanner(System.in);
		String answer="y";
		double sum = 0;
		while("y".equals(answer)) {
			System.out.println("��������Ʒ��ţ�");
			int number=input.nextInt();
			System.out.println("��������Ʒ������");
			int geshu=input.nextInt();
			String name="";
			double price=0;
			
			switch(number) {
			case 1:
				 name="T��";
				 price=245.0; 
				 break;
			case 2:
				name="����Ь";
				 price=570.0;
				 break;
			case 3:
				 name="������";
				 price=320.0;
				 break;
		    default: System.out.println("�������");
			}
			double currSum = price*geshu;	//���㱾����ѡ��Ʒ�ļ۸�
			System.out.println(name+"��"+price+"\t���� "+geshu+"\t�ϼ� "+currSum);
			sum+=currSum;	//����֮ǰ��ѡ��Ʒ���ܼ۸�
			System.out.println("�Ƿ������y/n��");
			answer=input.next();
		}
		double discount=0.8;
		double shouldpay=sum*discount;
		
		
		System.out.println("�ۿۣ�"+discount);
		
		System.out.println("Ӧ����"+shouldpay);
		System.out.println("ʵ����");
		double realpay=input.nextDouble();
		double change=realpay-shouldpay;
		System.out.println("��Ǯ��"+change);
	}
}
