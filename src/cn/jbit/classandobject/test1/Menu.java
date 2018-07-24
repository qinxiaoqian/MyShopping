package cn.jbit.classandobject.test1;

public class Menu {
	public void showLoginMenu() {
		System.out.println("\t欢迎使用我行我素购物管理系统");
		System.out.println("\t\t1.登录系统");
		System.out.println("\t\t2.退出");
		
	}
	public void showMainMenu() {
		System.out.println("\t我行我素购物管理系统主菜单");
		System.out.println("*************************");
		System.out.println("\t\t1.客户信息管理");
		System.out.println("\t\t2.真情回馈");
		
		
	}
	public void showCustMenu() {
		System.out.println("\t我行我素购物管理系统>客户信息管理");
		System.out.println("*************************");
		System.out.println("\t\t1.查询客户信息");
		System.out.println("\t\t2.修改客户信息");
		System.out.println("\t\t3.添加客户信息");
		System.out.println("\t\t4.显示所有客户信息");
		
		
	}
	public void showSendGMenu() {
		System.out.println("\t我行我素购物管理系统>真情回馈");
		System.out.println("*************************");
		System.out.println("\t\t1.幸运大放送");
		System.out.println("\t\t2.幸运抽奖");
		System.out.println("\t\t3.生日问候");
		
		
	}

}
