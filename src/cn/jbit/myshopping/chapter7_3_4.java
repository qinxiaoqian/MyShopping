package cn.jbit.myshopping;

public class chapter7_3_4 {
	public static void main(String[] args) {
		System.out.println("请输入4家店的价格");
		int[] price=new int[] {2800,2900,2750,3100};
		int min=price[0];
		for(int i=0;i<price.length;i++) {
			System.out.println("第"+(i+1)+"店的价格:"+price[i]);
			if(price[i]<min) {
				min=price[i];
			}
			
			
		}
		System.out.println("最低价格是:"+min);
		
	}

}
