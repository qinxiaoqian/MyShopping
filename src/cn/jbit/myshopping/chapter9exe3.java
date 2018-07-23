package cn.jbit.myshopping;

public class chapter9exe3 {
	public static void main(String[] args) {
		int i,j,k;
		for(i=0;i<=20;i++) {
			for(j=0;j<=33;j++) {
				k=3*(100-5*i-3*j);
				if(i+j+k==100) {
					System.out.println("有公鸡"+i+"只，母鸡"+j+"只，雏鸡"+k+"只。");
				}
			}
		}
	}

}
