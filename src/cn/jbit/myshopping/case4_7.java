package cn.jbit.myshopping;

import java.util.Scanner;

public class case4_7 {
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		double pay;
		System.out.print("���������ѽ�");
		pay=input.nextDouble();
		System.out.println("�Ƿ�μ��Żݻ������");
		System.out.println("1����50Ԫ����2Ԫ�������¿�������1ƿ");
		System.out.println("2����100Ԫ����3Ԫ����500ml����1ƿ");
		System.out.println("3����100Ԫ����10Ԫ����5�������");
		System.out.println("4����200Ԫ����10Ԫ�ɻ���1���ղ������˹�");
		System.out.println("5����200Ԫ����20Ԫ�ɻ���ŷ����ˬ��ˮ");
		System.out.println("0��������");
		System.out.print("��ѡ��:");
		int choice=input.nextInt();
		String goodType = null;
		
		switch(choice) {
		case 0:
			break;
		case 1:
			if (pay >= 50) {
				pay += 2;
				goodType = "���¿�������һƿ";
			} else {
				System.out.println("�����㻻��������");
				return;
			}
			break;
		case 2:
			if (pay >= 100) {
				pay += 3;
				goodType = "500ml����һƿ";
			} else {
				System.out.println("�����㻻��������");
				return;
			}
		case 3:
			if (pay >= 100) {
				pay += 10;
				goodType = "5�������һ��";
			} else {
				System.out.println("�����㻻��������");
				return;
			}
			break;
		case 4:
			if (pay >= 200) {
				pay += 10;
				goodType = "һ���ղ������˹�";
			} else {
				System.out.println("�����㻻��������");
				return;
			}
			break;
		case 5:
			if (pay >= 200) {
				pay += 20;
				goodType = "ŷ����ˬ��ˮһƿ";
			} else {
				System.out.println("�����㻻��������");
				return;
			}
			break;
		default:
			System.out.println("�������");
			return;
		}
		System.out.println("���������ܽ�" + pay);
		if (goodType != null) {
			System.out.println("�ɹ�������" + goodType);
		}
		
		
//		if(pay<50) {
//			System.out.print("0");
//			System.out.print("���������ܽ�"+pay);
//			
//		}else if(pay<100) {
//			switch(choice) {
//			case 1:
//				pay=pay+2;
//				System.out.println("1");
//				System.out.print("���������ܽ�"+pay);
//				System.out.print("�ɹ����������¿�������1ƿ��");
//				break;
//			case 0:
//				System.out.print("0");
//				System.out.print("���������ܽ�"+pay);
//				break;		
//        	}
//		}else if(pay<200) {
//			switch(choice) {
//			case 2:
//				pay=pay+3;
//				System.out.print("2");
//				System.out.println("���������ܽ�"+pay);
//				System.out.print("�ɹ�������500ml����1ƿ��");
//				break;
//			case 3:
//				System.out.print("3");
//				pay=pay+10;
//				System.out.print("���������ܽ�"+pay);
//				System.out.print("�ɹ�������5������ۡ�");
//				break;	
//			case 0:
//				System.out.print("0");
//				System.out.print("���������ܽ�"+pay);
//				break;		
//        	}
//		}else {
//			switch(choice) {
//			case 4:
//				pay=pay+10;
//				System.out.println("4");
//				System.out.print("���������ܽ�"+pay);
//				System.out.print("�ɹ��������ղ������˹�1����");
//				break;
//			case 5:
//				pay=pay+20;
//				System.out.print("5");
//				System.out.print("���������ܽ�"+pay);
//				System.out.print("�ɹ�������ŷ����ˬ��ˮ1ƿ��");
//				break;	
//			case 0:
//				System.out.print("0");
//				System.out.print("���������ܽ�"+pay);
//				break;		
//        	}
//		}
		
		
	}

}
