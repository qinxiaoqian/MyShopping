package cn.jbit.myshopping;
import java.util.Scanner;
public class case3_3_4 {
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("�������ع������ϵͳ>�ͻ���Ϣ����>��ӿͻ���Ϣ");
		System.out.println();
		System.out.print("�������Ա��(<4λ����>):");
		int custNo=input.nextInt();
		
		System.out.print("�������Ա����(��/��<����λ����ʾ>):");
		String custBirth=input.next();
		System.out.print("���������:");
		int custScore=input.nextInt();
		System.out.print("\n");
		
		if (custNo>=1000&&custNo<=9999) {
			System.out.println("��¼��Ļ�Ա��Ϣ��:");
			System.out.println(custNo+"\t"+custBirth+"\t"+custScore);
		} else {
			System.out.print("¼����Ϣʧ��");
		}
		
		
	}
		

}
