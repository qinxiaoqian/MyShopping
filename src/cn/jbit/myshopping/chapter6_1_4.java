package cn.jbit.myshopping;

import java.util.Scanner;

public class chapter6_1_4 {
	public static void main(String[] args) {
		int i;
		int age;
		int young=0;
		double percent;
		Scanner input=new Scanner(System.in);
		for(i=0;i<10;i++) {
			System.out.println("�������"+(i+1)+"λ�˿͵�����:");
			age=input.nextInt();
			if(age<=30) {
				young=young+1;
				
			}
		}
		percent=young/10.0;
		System.out.println("30�����µı����ǣ�"+percent*100+"%");
		System.out.println("30�����ϵı����ǣ�"+(1-percent)*100+"%");
		
		
	}

}
