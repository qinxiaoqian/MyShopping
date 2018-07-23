package cn.jbit.myshopping;

import java.util.Scanner;

public class chapter5exe5 {
	public static void main(String[] args) {
		int num;
		String day="";
		Scanner input=new Scanner(System.in);
//		System.out.println("请输入数字1-7（输0结束）：");
//		while((num=input.nextInt())!=0) {
//			switch(num) {
//		    case 1:
//				day="今天是Mon";
//			    break;
//			case 2:
//				day="今天是Tue";
//			    break;
//			case 3:
//				day="今天是Wed";
//			    break;
//			case 4:
//				day="今天是Thu";
//			    break;
//			case 5:
//				day="今天是Fri";
//			    break;
//			case 6:
//				day="今天是Sat";
//			    break;    
//			case 7:
//				day="今天是Sun";
//			    break;
//			default:
//				day="请输入正确数字！";
//			}
//			System.out.println(day);
//		}
//		System.out.println("程序结束！");
		do{
			System.out.println("请输入数字1-7（输0结束）：");
			num=input.nextInt();
			switch(num) {
		    case 1:
				day="Mon";
			    break;
			case 2:
				day="Tue";
			    break;
			case 3:
				day="Wed";
			    break;
			case 4:
				day="Thu";
			    break;
			case 5:
				day="Fri";
			    break;
			case 6:
				day="Sat";
			    break;    
			case 7:
				day="Sun";
			    break;
			default:
				if(num!=0)
					System.out.println("请输入正确数字！");
			}
			if(num<=7 && num>=1)
				System.out.println("今天是"+day);
		}while(num!=0);
		System.out.println("程序结束！");
		
	}

}
