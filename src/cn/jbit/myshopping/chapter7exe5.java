package cn.jbit.myshopping;

public class chapter7exe5 {
	public static void main(String[] args) {
		int[] array=new int[] {1,3,-1,5,-2};
		int[] newArray=new int[5];
		System.out.println("ԭ����Ϊ��");
		for(int i=0;i<array.length;i++) {
			
			System.out.print(array[i]+" ");
			
		}
		System.out.println("\n���򲢴���������Ϊ��");
		for(int i=0;i<newArray.length;i++) {
			newArray[i]=array[array.length-1-i];
			if(newArray[i]<0) {
				newArray[i]=0;
			}
			System.out.print(newArray[i]+" ");
			
		}
		
	}

}
