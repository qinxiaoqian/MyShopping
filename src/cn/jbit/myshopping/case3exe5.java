package cn.jbit.myshopping;
import java.util.Scanner;
public class case3exe5 {
	public static void main(String[] args) {
		int a;
		Scanner input=new Scanner(System.in);
		System.out.println("������һ������:");
		a=input.nextInt();
		if(a%3==0||a%5==0) {
			System.out.println("��������3��5�ı�����");	
		}else {
			System.out.println("�������ܱ�3��5�е��κ�һ����������");
			 
		}
	}

}
