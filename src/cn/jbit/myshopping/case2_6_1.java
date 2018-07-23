package cn.jbit.myshopping;

public class case2_6_1 {
	public static void main(String[] args) {
		int uniprice1=245;     //T恤的单价
		int count1=2;          //T恤的个数
		int uniprice2=570;     //网球鞋的单价
		int count2=1;          //网球鞋的个数
		int uniprice3=320;     //网球拍的单价
		int count3=1;          //网球拍的个数
		double discount=0.8;
		double sum=(uniprice1*count1+uniprice2*count2+uniprice3*count3)*discount;
		System.out.print("总价="+sum);
	}

}
