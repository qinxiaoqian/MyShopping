package cn.jbit.myshopping;
import java.util.Scanner;
public class case2exercise2 {
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("请输入华氏温度：");
		double huashidu=input.nextDouble();
		double sheshidu=5/9.0*(huashidu-32);
		System.out.println("摄氏度:"+sheshidu);
		
	}

}
