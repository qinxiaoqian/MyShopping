package cn.jbit.myshopping;

import java.util.Scanner;

public class chapter7exe4 {
	public static void main(String[] args) {
		int[] num=new int[10];
		int sum1=0;
		int sum2=0;
		int sum3=0;
		int sumother=0;
		Scanner input=new Scanner(System.in);
		System.out.println("������10����");
		for(int i=0;i<num.length;i++) {
			num[i]=input.nextInt();
			if(num[i]==1) {
				sum1++;
			}else if(num[i]==2) {
				sum2++;
			}else if(num[i]==3) {
				sum3++;
			}else {
				sumother++;
			}
			
			
		}
		System.out.print("�����10����Ϊ��");
		for(int i=0;i<num.length;i++){
			System.out.print(num[i]+" ");
		}
		System.out.println("\n����1�ĸ�����"+sum1);
		System.out.println("����2�ĸ�����"+sum2);
		System.out.println("����3�ĸ�����"+sum3);
		System.out.println("�Ƿ����ֵĸ�����"+sumother);
		
		
	}

}
