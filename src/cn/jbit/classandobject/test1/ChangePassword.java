package cn.jbit.classandobject.test1;

import java.util.Scanner;

public class ChangePassword {
	public static void main(String[] args) {
		String nameInput;
		String psw;
		String pswConfirm;
		Administrator admin=new Administrator();
		admin.name="admin1";
		admin.password="111111";
		
		System.out.print("�������û�����");
		Scanner input=new Scanner(System.in);
		nameInput=input.next();
		System.out.print("���������룺");
		psw=input.next();
		
		if(admin.name.equals(nameInput)&&admin.password.equals(psw)) {
			System.out.print("\n�����������룺");
			psw=input.next();
			System.out.print("���ٴ����������룺");
			pswConfirm=input.next();
			while(!psw.equals(pswConfirm)) {
				System.out.println("��������������벻��ͬ�����������룡");
				System.out.print("�����������룺");
				psw=input.next();
				System.out.print("���ٴ����������룺");
				pswConfirm=input.next();
				
			}
			System.out.print("�޸�����ɹ�������������Ϊ��"+pswConfirm);
			
		}else {
			System.out.println("�û��������벻ƥ�䣡��û��Ȩ�޸��¹���Ա��Ϣ��");
		}
		
		
		
		
		
		
		
	}

}
