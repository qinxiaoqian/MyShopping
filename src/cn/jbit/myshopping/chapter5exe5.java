package cn.jbit.myshopping;

import java.util.Scanner;

public class chapter5exe5 {
	public static void main(String[] args) {
		int num;
		String day="";
		Scanner input=new Scanner(System.in);
//		System.out.println("����������1-7����0��������");
//		while((num=input.nextInt())!=0) {
//			switch(num) {
//		    case 1:
//				day="������Mon";
//			    break;
//			case 2:
//				day="������Tue";
//			    break;
//			case 3:
//				day="������Wed";
//			    break;
//			case 4:
//				day="������Thu";
//			    break;
//			case 5:
//				day="������Fri";
//			    break;
//			case 6:
//				day="������Sat";
//			    break;    
//			case 7:
//				day="������Sun";
//			    break;
//			default:
//				day="��������ȷ���֣�";
//			}
//			System.out.println(day);
//		}
//		System.out.println("���������");
		do{
			System.out.println("����������1-7����0��������");
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
					System.out.println("��������ȷ���֣�");
			}
			if(num<=7 && num>=1)
				System.out.println("������"+day);
		}while(num!=0);
		System.out.println("���������");
		
	}

}
