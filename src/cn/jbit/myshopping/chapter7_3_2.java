package cn.jbit.myshopping;

import java.util.Arrays;
import java.util.Scanner;

public class chapter7_3_2 {
	public static void main(String[] args) {
		char[] alphabet=new char[] {'s','g','y','i','f','b','n','a'};
		System.out.println("ԭ�ַ����У�"+new String(alphabet));
//		Scanner input=new Scanner(System.in);
//		for(int i=0;i<8;i++) {
//			
//			System.out.print("�������"+(i+1)+"���ַ���");
//			alphabet[i]=input.next();
//			
//			
//		}
		Arrays.sort(alphabet);
		System.out.print("���������");
		for(int i=0;i<8;i++) {
			
			System.out.print(alphabet[i]+" ");
			
		}
		System.out.print("��������Ϊ��");
        for(int i=7;i>=0;i--) {
			
			System.out.print(alphabet[i]+" ");
        }
		
	}

}
