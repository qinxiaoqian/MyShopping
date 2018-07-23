package cn.jbit.classandobject.test1;

public class Calculator {
	int a;
	int b;
	String c;
	public void show() {
		if("+".equals(c)) {
			System.out.println(a+"+"+b+"="+(a+b));
			
		}else if("-".equals(c)) {
			System.out.println(a+"-"+b+"="+(a-b));
			
			
		}else if("*".equals(c)) {
			System.out.println(a+"*"+b+"="+(a*b));
			
			
		}else if("/".equals(c)) {
			System.out.println(a+"/"+b+"="+(1.0* a/b));
			
			
		}
		
	}

}
