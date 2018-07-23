package cn.jbit.myshopping;

import java.util.Scanner;

public class case2_6 {
	public static void main(String[] args){
	Scanner input=new Scanner(System.in);
	System.out.println("请输入基本工资:");
	double jibengongzi=input.nextDouble();
	double wujiajintie=jibengongzi*0.4;
	double fangzujintie=0.25*jibengongzi;
	double xinshui=jibengongzi+wujiajintie+fangzujintie;
	System.out.println("该员工的工资细目为:");
	System.out.println("基本工资为:"+jibengongzi);
	System.out.println("物价津贴为:"+wujiajintie);
	System.out.println("房租津贴为:"+fangzujintie);
	System.out.println("员工薪水是:"+xinshui);
	}	

}
