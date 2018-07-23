package cn.jbit.myshopping;

public class chapter6exe2 {
	public static void main(String[] args) {
		
		int rabbit,chicken;
		for(rabbit=0;rabbit<=35;rabbit++) {
			chicken=35-rabbit;
			if((4*rabbit+2*chicken)==94) {
				System.out.println("共有兔"+rabbit+"只，鸡"+chicken+"只。");
				break;
			}
		}
	}

}
