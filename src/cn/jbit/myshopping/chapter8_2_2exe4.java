package cn.jbit.myshopping;

import java.util.Scanner;

public class chapter8_2_2exe4 {
	public static void main(String[] args) {
		String name=null;
		int number=0;
		int cardNo=0;
		System.out.println("*****��ӭ���뽱�͸���ϵͳ*****");
		System.out.println("\t1.ע��");
		System.out.println("\t2.��¼");
		System.out.println("\t3.�齱");
		System.out.println("*************************");
		System.out.print("��ѡ��˵�");
		Scanner input=new Scanner(System.in);
		int num=input.nextInt();
		switch(num) {
		case 1:
			System.out.println("[���͸���ϵͳ>ע��]");
			break;
		case 2:
			System.out.println("[���͸���ϵͳ>��¼]");
			break;
		case 3:
			System.out.println("[���͸���ϵͳ>�齱]");
			break;
		default:
			System.out.println("������������");
		}
		System.out.println("����д����ע����Ϣ");
		System.out.print("�û�����");
		name=input.next();
		System.out.print("���룺");
		number=input.nextInt();
		System.out.println();
		System.out.println("ע��ɹ������ס���Ļ�Ա����");
		System.out.println("�û���\t����\t��Ա����");
		int max=9999;
		int min=1000;
		cardNo=(int)(Math.random()*(max-min))+min;
		System.out.println(name+"\t"+number+"\t"+cardNo);
		System.out.println("������?(y/n)");
		String answer=input.next();
		if("n".equals(answer)) {
			System.out.println();
			System.out.println("ϵͳ�˳���ллʹ�ã�");
			
		}
		if("y".equals(answer)) {
			System.out.println();
			System.out.println("ϵͳ�˳���ллʹ�ã�");
			
		}
	}	
	
	public static void main2(String[] args) {
		boolean cont = false;
		do {
			//TODO: 1. ��ʾ�˵���ѡ����
			int tag = 0;
			//TODO: 2 ���벻ͬ��֧
			switch(tag) {
			case 1:
				//TODO: 3 ע���û�
				
				break;
			case 2:
				boolean err3times = true;
				for(int i=0;i<3;i++) {
					//TODO: 4.1  �����û�������
					
					//TODO: 4.2 �ж��Ƿ���ȷ
					if(true) {
						//TODO: 4.3 ��ȷ����ѭ��
						err3times = false;
						break;
					} else {
						//TODO: 4.4  ����ȷ���������û�������
						
					}
				}
				if(err3times) {
					break;
				}
				break;
			case 3:
				
				break;
			}
			//TODO: �ж��Ƿ����
			
		} while(cont);
		System.out.println();
	}

}
