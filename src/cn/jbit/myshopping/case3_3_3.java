package cn.jbit.myshopping;
import java.util.Scanner;
public class case3_3_3 {
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("����java�ɼ�:");
		int java=input.nextInt();
		System.out.println("�������ֳɼ�:");
		int music=input.nextInt();
		if((java>98&&music>80)||(java==100&&music>70)) {
			System.out.println("��ʦ˵:���ֲ���,������һ��MP4!");
		}
		
	}
	

}
