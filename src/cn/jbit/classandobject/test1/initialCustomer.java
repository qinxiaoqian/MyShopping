package cn.jbit.classandobject.test1;

public class initialCustomer {
	public static void main(String[] args) {
		Customer customer=new Customer();
		customer.score=3050;
		customer.cardType="��";
		int scoreBack;
		customer.show();
		if((customer.cardType=="��"&&customer.score>1000)||(customer.cardType=="�տ�"&&customer.score>5000)) {
			scoreBack=500;
			System.out.println("��������"+scoreBack+"�֣�");
			
		}
		
	}

}
