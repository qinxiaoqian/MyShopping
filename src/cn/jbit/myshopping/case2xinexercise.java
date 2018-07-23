package cn.jbit.myshopping;

public class case2xinexercise {
	public static void main(String[] args) {
		int a=10;
		int b=8;
		
		System.out.println("输出互换前手中的纸牌：");
		System.out.println("左手中的纸牌："+a);
		System.out.println("右手中的纸牌："+b);
		System.out.println("\n");
		System.out.println("输出互换后手中的纸牌：");
		int c=a;
		a=b;
		b=c;
		
		
		System.out.println("左手中的纸牌："+a);
		
		System.out.println("右手中的纸牌："+b);
	}

}
