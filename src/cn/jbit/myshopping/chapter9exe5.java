package cn.jbit.myshopping;

import java.util.Scanner;

public class chapter9exe5 {
	public static void main(String[] args) {
		int passwordright=111111;
		int password = -1;
		int amount;
		Scanner input=new Scanner(System.in);
		for(int i=1;i<=3;i++){
			System.out.print("���������룺");
			password=input.nextInt();
			if(password!=passwordright) {
				continue;
				
			}
			boolean flag=true;
			System.out.print("�������");
			while(flag) {
				amount=input.nextInt();
				if(amount>=0&&amount<=1000&&amount%100==0) {
					System.out.println("��ȡ��"+amount+"Ԫ");
					flag = false;
				}else {
					System.out.print("������Ľ��Ϸ������������룺");
				}
			}
			if(!flag) break;
		}
		if(password!=passwordright) {
			System.out.println("���������ȡ����");
		}else {
			System.out.println("������ɣ���ȡ��!");
			
		}
		
		
		
		
	}

}
