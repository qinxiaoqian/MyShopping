package cn.jbit.myshopping;

import java.util.Scanner;

public class case4_7 {
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		double pay;
		System.out.print("请输入消费金额：");
		pay=input.nextDouble();
		System.out.println("是否参加优惠换购活动：");
		System.out.println("1：满50元，加2元换购百事可乐饮料1瓶");
		System.out.println("2：满100元，加3元换购500ml可乐1瓶");
		System.out.println("3：满100元，加10元换购5公斤面粉");
		System.out.println("4：满200元，加10元可换购1个苏泊尔炒菜锅");
		System.out.println("5：满200元，加20元可换购欧莱雅爽肤水");
		System.out.println("0：不换购");
		System.out.print("请选择:");
		int choice=input.nextInt();
		String goodType = null;
		
		switch(choice) {
		case 0:
			break;
		case 1:
			if (pay >= 50) {
				pay += 2;
				goodType = "百事可乐饮料一瓶";
			} else {
				System.out.println("不满足换购条件！");
				return;
			}
			break;
		case 2:
			if (pay >= 100) {
				pay += 3;
				goodType = "500ml可乐一瓶";
			} else {
				System.out.println("不满足换购条件！");
				return;
			}
		case 3:
			if (pay >= 100) {
				pay += 10;
				goodType = "5公斤面粉一袋";
			} else {
				System.out.println("不满足换购条件！");
				return;
			}
			break;
		case 4:
			if (pay >= 200) {
				pay += 10;
				goodType = "一个苏泊尔炒菜锅";
			} else {
				System.out.println("不满足换购条件！");
				return;
			}
			break;
		case 5:
			if (pay >= 200) {
				pay += 20;
				goodType = "欧莱雅爽肤水一瓶";
			} else {
				System.out.println("不满足换购条件！");
				return;
			}
			break;
		default:
			System.out.println("输入错误！");
			return;
		}
		System.out.println("本次消费总金额：" + pay);
		if (goodType != null) {
			System.out.println("成功换购：" + goodType);
		}
		
		
//		if(pay<50) {
//			System.out.print("0");
//			System.out.print("本次消费总金额："+pay);
//			
//		}else if(pay<100) {
//			switch(choice) {
//			case 1:
//				pay=pay+2;
//				System.out.println("1");
//				System.out.print("本次消费总金额："+pay);
//				System.out.print("成功换购：百事可乐饮料1瓶。");
//				break;
//			case 0:
//				System.out.print("0");
//				System.out.print("本次消费总金额："+pay);
//				break;		
//        	}
//		}else if(pay<200) {
//			switch(choice) {
//			case 2:
//				pay=pay+3;
//				System.out.print("2");
//				System.out.println("本次消费总金额："+pay);
//				System.out.print("成功换购：500ml可乐1瓶。");
//				break;
//			case 3:
//				System.out.print("3");
//				pay=pay+10;
//				System.out.print("本次消费总金额："+pay);
//				System.out.print("成功换购：5公斤面粉。");
//				break;	
//			case 0:
//				System.out.print("0");
//				System.out.print("本次消费总金额："+pay);
//				break;		
//        	}
//		}else {
//			switch(choice) {
//			case 4:
//				pay=pay+10;
//				System.out.println("4");
//				System.out.print("本次消费总金额："+pay);
//				System.out.print("成功换购：苏泊尔炒菜锅1个。");
//				break;
//			case 5:
//				pay=pay+20;
//				System.out.print("5");
//				System.out.print("本次消费总金额："+pay);
//				System.out.print("成功换购：欧莱雅爽肤水1瓶。");
//				break;	
//			case 0:
//				System.out.print("0");
//				System.out.print("本次消费总金额："+pay);
//				break;		
//        	}
//		}
		
		
	}

}
