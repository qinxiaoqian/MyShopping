package cn.jbit.myshopping;

public class chapter6exe4 {
	public static void main(String[] args) {
		int men;
		int women=0;
		int kids=0;
		for(men=0;men<=30;men++) {
			//if((men+women+kids==30)&&(3*men+2*women+kids==50)) {
			//	System.out.println("��������"+men+"����Ů��"+women+"����С��"+kids+"����");
			
		    for(women=0;women<=30;women++) {
		    	for(kids=0;kids<=30;kids++) {
		    		if((men+women+kids==30)&&(3*men+2*women+kids==50)) {
		    			System.out.println("��������"+men+"����Ů��"+women+"����С��"+kids+"����");
		    		}
		    	}
		    }
		
			
		}
		
	}

}
