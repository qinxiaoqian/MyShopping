package cn.jbit.myshopping;

import java.util.Scanner;

public class chapter7exe2 {
	public static void main(String[] args) {
		String[] sentences=new String[5];
		String[] sentencesnew=new String[5]; 
		System.out.println("������5�仰");
		Scanner input=new Scanner(System.in);
		for(int i=0;i<sentences.length;i++) {
			System.out.println("��"+(i+1)+"�仰");
			sentences[i]=input.next();
			
		}
		System.out.println("");
		System.out.println("�������5�仰Ϊ��");
		for(int i=0;i<sentencesnew.length;i++) {
			sentencesnew[i]=sentences[4-i];
			System.out.println(sentencesnew[i]);
			
		}
	}

}
