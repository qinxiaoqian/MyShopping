package cn.jbit.classandobject.test1;

public class initialCustomer {
	public static void main(String[] args) {
		Customer customer=new Customer();
		customer.score=3050;
		customer.cardType="金卡";
		int scoreBack;
		customer.show();
		if((customer.cardType=="金卡"&&customer.score>1000)||(customer.cardType=="普卡"&&customer.score>5000)) {
			scoreBack=500;
			System.out.println("回馈积分"+scoreBack+"分！");
			
		}
		
	}

}
