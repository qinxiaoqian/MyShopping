package cn.jbit.myshopping;

public class case2_6_1 {
	public static void main(String[] args) {
		int uniprice1=245;     //T���ĵ���
		int count1=2;          //T���ĸ���
		int uniprice2=570;     //����Ь�ĵ���
		int count2=1;          //����Ь�ĸ���
		int uniprice3=320;     //�����ĵĵ���
		int count3=1;          //�����ĵĸ���
		double discount=0.8;
		double sum=(uniprice1*count1+uniprice2*count2+uniprice3*count3)*discount;
		System.out.print("�ܼ�="+sum);
	}

}
