package cn.jbit.myshopping;

import java.util.Scanner;

public class chapter8_2_2exe4new {
	public static void main(String[] args) {
		String answer=null;
		String name=null;
		String name1=null;
		
		String number=null;
		String number1=null;

		int cardNo;
		int max=9999;
		int min=1000;
	
		
		do {
			System.out.println("*****��ӭ���뽱�͸���ϵͳ*****");
		    System.out.println("\t1.ע��");
		    System.out.println("\t2.��¼");
		    System.out.println("\t3.�齱");
		    System.out.println("*************************");
		    System.out.print("��ѡ��˵�");
		    Scanner input=new Scanner(System.in);
			int num=input.nextInt();
			if(num==1) {
				System.out.println("[���͸���ϵͳ>ע��]");
				System.out.println("����д����ע����Ϣ");
				System.out.print("�û�����");
				name=input.next();
				System.out.print("���룺");
				number=input.next();
				System.out.println();
				System.out.println("ע��ɹ������ס���Ļ�Ա����");
				System.out.println("�û���\t����\t��Ա����");
				
				cardNo=(int)(Math.random()*(max-min))+min;
				System.out.println(name+"\t"+number+"\t"+cardNo);
				
			}else if(num==2) {
				
				System.out.println("[���͸���ϵͳ>��¼]");
			
				for(int i=0;i<3;i++) {
					System.out.println("�������û�����");
					name1=input.next();
					System.out.println("���������룺");
					number1=input.next();
					if((name1.equals(name))&&(number1.equals(number))){
						
						System.out.println();
				        System.out.println("��ӭ����"+name1);
				        break;
					}else {
						if(i==2) {
							System.out.println("��������Σ������˳���");
							System.exit(0);
						} else {
							System.out.println("����"+(2-i)+"�λ��᣺");
						}
						
					}
				}
					
			}else if(num==3) {
				boolean lucky=false;
				System.out.println("[���͸���ϵͳ>�齱]");
				System.out.println("���������Ŀ��ţ�");
				cardNo=input.nextInt();
				System.out.println();
				int[] luckynumbers=new int[5];
				System.out.print("���յ���������Ϊ�� ");
				for(int i=0;i<luckynumbers.length;i++) {
					luckynumbers[i]=(int)(Math.random()*(max-min))+min;
					System.out.print(luckynumbers[i]+" ");
					if(luckynumbers[i]==cardNo) {
						lucky=true;
					}
				}
				if(lucky) {
					System.out.println("��ϲ���Ǳ��յ����˻�Ա��");
				}else {
					System.out.println("��Ǹ�������Ǳ��յ����˻�Ա��");
				}
					
					
				
				
				
			}
			System.out.println("������?(y/n)");
			answer = input.next();
		}while("y".equals(answer));
		System.out.println();
		System.out.println("ϵͳ�˳���ллʹ�ã�");
		
		
	}

}
