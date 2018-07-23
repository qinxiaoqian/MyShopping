package cn.jbit.myshopping;

public class chapter6_2_2 {
	public static void main(String[] args) {
		int num;
		int sum=0;
		for(num=1;num<=100;num++) {
			if(num%10==2||num%10==3||num%10==4||num%10==7||num%3==0) {
				continue;
			}
			sum=sum+num;
		}
		System.out.println("Êä³öºÍ£º"+sum);
	}

}
