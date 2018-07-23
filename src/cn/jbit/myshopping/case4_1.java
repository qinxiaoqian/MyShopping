package cn.jbit.myshopping;

import java.util.Scanner;

public class case4_1 {
	public static void main(String[] args) {
		System.out.println("我行我素购物管理系统>购物管理系统");
		Scanner input=new Scanner(System.in);
		System.out.println();
		System.out.print("请输入4位会员号：");
		int custNo=input.nextInt();
		int random=(int)(Math.random()*10);
		if(custNo/100%10==random) {
			System.out.println(custNo+"号客户是幸运客户,获精美MP3一个。");
		}else {
			System.out.println(custNo+"号客户,谢谢您的支持!");
		}
	}

}
