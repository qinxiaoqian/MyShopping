package cn.jbit.myshopping;
import java.util.Scanner;
public class case3exercise {
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		int a;
		int b;
		int c;
		int d;
		System.out.println("输入第一个整数:");
		a=input.nextInt();
		System.out.println("输入第二个整数:");
		b=input.nextInt();
		System.out.println("输入第三个整数:");
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
		System.out.println("按顺序排列:"+a+"\t"+b+"\t"+c);
		
	}

}
