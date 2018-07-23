package cn.jbit.myshopping;

public class chapter6exe3 {
	public static void main(String[] args) {
		//int num;
		for(int num=1;num<=100;num++) {
			if(num%3==0&&num%5!=0) {
				System.out.println("Flip");
				
			}else if(num%5==0&&num%3!=0) {
				System.out.println("Flop");
				
			}else if(num%5==0&&num%3==0) {
				System.out.println("FlipFlop");
				
			}else {
				System.out.println(num);
			}
		}
	}

}
