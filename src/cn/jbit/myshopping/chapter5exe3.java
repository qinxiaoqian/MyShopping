package cn.jbit.myshopping;

public class chapter5exe3 {
	public static void main(String[] args) {
		int num=0;
		int sum=0;
		while(num<=50) {
			if(num%7==0) {
				sum=sum+num;
			}
			num++;	
		}
		System.out.println(sum);
	}

}
