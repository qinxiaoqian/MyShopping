package cn.jbit.myshopping;

import java.util.Arrays;
import java.util.Scanner;

public class chapter7_3_2 {
	public static void main(String[] args) {
		char[] alphabet=new char[] {'s','g','y','i','f','b','n','a'};
		System.out.println("Ô­×Ö·ûÐòÁÐ£º"+new String(alphabet));
//		Scanner input=new Scanner(System.in);
//		for(int i=0;i<8;i++) {
//			
//			System.out.print("ÇëÊäÈëµÚ"+(i+1)+"¸ö×Ö·ûÐò£º");
//			alphabet[i]=input.next();
//			
//			
//		}
		Arrays.sort(alphabet);
		System.out.print("ÉýÐòÅÅÐòºó£º");
		for(int i=0;i<8;i++) {
			
			System.out.print(alphabet[i]+" ");
			
		}
		System.out.print("ÄæÐòÅÅÐòÎª£º");
        for(int i=7;i>=0;i--) {
			
			System.out.print(alphabet[i]+" ");
        }
		
	}

}
