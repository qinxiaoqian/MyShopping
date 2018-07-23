package cn.jbit.myshopping;

public class chapter7exe3 {
	public static void main(String[] args) {
		int[] points=new int[] {18,25,7,36,13,2,89,63};
		int min=points[0];
		int index=0;
		for(int i=0;i<points.length;i++) {
			if(points[i]<min) {
				min=points[i];
				index=i;
			}
		}
		System.out.println("最小积分为："+min);
		System.out.println("下标为："+index);
	}

}
