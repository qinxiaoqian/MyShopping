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
		
		System.out.print("请输入用户名：");
		Scanner input=new Scanner(System.in);
		nameInput=input.next();
		System.out.print("请输入密码：");
		psw=input.next();
		
		if(admin.name.equals(nameInput)&&admin.password.equals(psw)) {
			System.out.print("\n请输入新密码：");
			psw=input.next();
			System.out.print("请再次输入新密码：");
			pswConfirm=input.next();
			while(!psw.equals(pswConfirm)) {
				System.out.println("您两次输入的密码不相同，请重新输入！");
				System.out.print("请输入新密码：");
				psw=input.next();
				System.out.print("请再次输入新密码：");
				pswConfirm=input.next();
				
			}
			System.out.print("修改密码成功，您的新密码为："+pswConfirm);
			
		}else {
			System.out.println("用户名和密码不匹配！您没有权限更新管理员信息！");
		}
		
		
		
		
		
		
		
	}

}
