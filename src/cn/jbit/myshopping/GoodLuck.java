package cn.jbit.myshopping;

import java.util.Scanner;

public class GoodLuck {
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("������4λ��Ա���ţ�");
		int cardnum=input.nextInt();
		double numqian1=cardnum/1000;
		int numqian=(int)numqian1;
		double numbai1=cardnum/100-10*numqian;
		int numbai=(int)numbai1;
		double numshi1=cardnum/10-100*numqian-10*numbai;
		int numshi=(int)numshi1;
		int numge=cardnum%10;
		int sum=numqian+numbai+numshi+numge;
		System.out.println("��Ա����"+cardnum+"��λ֮��:"+sum);	
		
	}

}
