package cn.jbit.myshopping;
import java.util.Scanner;
public class case3_1 {
	public static void main(String[] args) {
		int scorelisi=80;
		Scanner input=new Scanner(System.in);
		System.out.println("张三的成绩:");
		double scorezhangsan=input.nextDouble();
		boolean isBig;
		isBig=scorezhangsan>scorelisi;
		System.out.println("张三的成绩比李四的成绩高吗:"+isBig);
		
		
		
	}

}
