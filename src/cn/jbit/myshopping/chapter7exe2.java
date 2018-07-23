package cn.jbit.myshopping;

import java.util.Scanner;

public class chapter7exe2 {
	public static void main(String[] args) {
		String[] sentences=new String[5];
		String[] sentencesnew=new String[5]; 
		System.out.println("请输入5句话");
		Scanner input=new Scanner(System.in);
		for(int i=0;i<sentences.length;i++) {
			System.out.println("第"+(i+1)+"句话");
			sentences[i]=input.next();
			
		}
		System.out.println("");
		System.out.println("逆序输出5句话为：");
		for(int i=0;i<sentencesnew.length;i++) {
			sentencesnew[i]=sentences[4-i];
			System.out.println(sentencesnew[i]);
			
		}
	}

}
