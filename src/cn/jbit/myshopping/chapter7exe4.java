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
		System.out.println("请输入10个数");
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
		System.out.print("输入的10个数为：");
		for(int i=0;i<num.length;i++){
			System.out.print(num[i]+" ");
		}
		System.out.println("\n数字1的个数："+sum1);
		System.out.println("数字2的个数："+sum2);
		System.out.println("数字3的个数："+sum3);
		System.out.println("非法数字的个数："+sumother);
		
		
	}

}
