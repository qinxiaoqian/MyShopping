package cn.jbit.myshopping;
import java.util.Scanner;
public class case3_3_4 {
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("我行我素购物管理系统>客户信息管理>添加客户信息");
		System.out.println();
		System.out.print("请输入会员号(<4位整数>):");
		int custNo=input.nextInt();
		
		System.out.print("请输入会员生日(月/日<用两位数表示>):");
		String custBirth=input.next();
		System.out.print("请输入积分:");
		int custScore=input.nextInt();
		System.out.print("\n");
		
		if (custNo>=1000&&custNo<=9999) {
			System.out.println("已录入的会员信息是:");
			System.out.println(custNo+"\t"+custBirth+"\t"+custScore);
		} else {
			System.out.print("录入信息失败");
		}
		
		
	}
		

}
