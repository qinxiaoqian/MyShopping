package cn.jbit.myshopping;

import java.util.Scanner;

public class chapter6_3 {
	public static void main(String[] args) {
		int num,i;
		String birthday;
		int score;
		Scanner input=new Scanner(System.in);
		System.out.println("MyShopping����ϵͳ>�ͻ���Ϣ����>��ӿͻ���Ϣ");
		for(i=0;i<3;i++) {
		    System.out.println();
		    System.out.println("�������Ա��(<4λ����>)��");
		    num=input.nextInt();
		    System.out.println("�������Ա����(��/��<����λ������ʾ>)��");
		    birthday=input.next();
		    System.out.println("�������Ա���֣�");
		    score=input.nextInt();
		    System.out.println("��¼��Ļ�Ա��Ϣ�ǣ�");
		    System.out.println(num+"\t"+birthday+"\t"+score);
		    if(num>=1000&&num<=9999) {
		    	continue;
		    }
		    System.out.println("�ͻ���"+num+"����Ч��Ա�ţ�");
		    System.out.println("¼����Ϣʧ��");
		}
		System.out.println("���������");
		
		
		
	}

}
