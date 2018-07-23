package cn.jbit.myshopping;
import java.util.Scanner;
public class case3exe5 {
	public static void main(String[] args) {
		int a;
		Scanner input=new Scanner(System.in);
		System.out.println("请输入一个整数:");
		a=input.nextInt();
		if(a%3==0||a%5==0) {
			System.out.println("该整数是3或5的倍数。");	
		}else {
			System.out.println("该数不能被3或5中的任何一个数整除。");
			 
		}
	}

}
