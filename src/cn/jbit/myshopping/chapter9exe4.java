package cn.jbit.myshopping;

import java.util.Scanner;

public class chapter9exe4 {
	public static void main(String[] args) {
		int sum=0;
		int count=0;
		double avg;
		int classNum=3;
		int[] scores=new int[4];
		Scanner input=new Scanner(System.in);
		for(int i=0;i<3;i++) {
			System.out.println("输入第"+(i+1)+"班成绩");
			for(int j=0;j<4;j++) {
				System.out.print("输入第"+(j+1)+"名同学成绩：");
				scores[j]=input.nextInt();
				if(scores[j]>85) {
					sum=sum+scores[j];
					count++;
				}	
				
			}
		}
		avg=1.0*sum/count;
		System.out.print("大于85分同学的平均分为："+avg);
	}

}
