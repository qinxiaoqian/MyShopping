package cn.jbit.myshopping;
import java.util.Scanner;
public class case3exercise {
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		int a;
		int b;
		int c;
		int d;
		System.out.println("�����һ������:");
		a=input.nextInt();
		System.out.println("����ڶ�������:");
		b=input.nextInt();
		System.out.println("�������������:");
		c=input.nextInt();
		
		
		if(a>b) {
			d=a;	
			a=b;
			b=d;
		
		}
		if(a>c) {
			d=a;	
			a=c;
			c=d;
		}
		if(b>c) {
			d=b;	
			b=c;
			c=d;
		}
		System.out.println("��˳������:"+a+"\t"+b+"\t"+c);
		
	}

}
