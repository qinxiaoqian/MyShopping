package cn.jbit.myshopping;

import java.util.Scanner;

public class chapter9_1_2 {
	public static void main(String[] args) {
		String[] books=new String[] {"Computer","Hibernate","Java","Struts"};
		String[] newBooks=new String[books.length+1];
		int index=books.length;
		String book="";
		System.out.print("����ǰ������Ϊ��");
		for(int i=0;i<books.length;i++) {
			System.out.print(books[i]+" ");
		}
		for(int i=0;i<books.length;i++) {
			newBooks[i]=books[i];
		}
		
		Scanner input=new Scanner(System.in);
		System.out.print("\n�������������ƣ�");
		book=input.next();
		for(int i=0;i<books.length;i++) {
			if(books[i].compareToIgnoreCase(book)>0) {
				index=i;
				break;
				
			}
		}
		for(int i=newBooks.length-1;i>index;i--) {
			newBooks[i]=newBooks[i-1];
			
		}
		newBooks[index]=book;
		System.out.print("����������Ϊ��");
		for(int i=0;i<newBooks.length;i++) {
			System.out.print(newBooks[i]+" ");
		}
		
		
		
		
		
		
	}

}
