package cn.jbit.myshopping;

import java.util.Scanner;

public class case2_6 {
	public static void main(String[] args){
	Scanner input=new Scanner(System.in);
	System.out.println("�������������:");
	double jibengongzi=input.nextDouble();
	double wujiajintie=jibengongzi*0.4;
	double fangzujintie=0.25*jibengongzi;
	double xinshui=jibengongzi+wujiajintie+fangzujintie;
	System.out.println("��Ա���Ĺ���ϸĿΪ:");
	System.out.println("��������Ϊ:"+jibengongzi);
	System.out.println("��۽���Ϊ:"+wujiajintie);
	System.out.println("�������Ϊ:"+fangzujintie);
	System.out.println("Ա��нˮ��:"+xinshui);
	}	

}
