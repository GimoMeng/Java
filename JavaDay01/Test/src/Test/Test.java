package Test;

import java.util.Scanner;

public class Test {

	public static void main(String[] args){
		
		
		Scanner sc = new Scanner(System.in);
				
		System.out.println("请输入你的年龄");
		int age = sc.nextInt();
		System.out.println("请输入你的身份证号");
//		final long ID = sc.nextLong();
		
		final String ID = sc.next();
		System.out.println("你好，你的年龄是"+age+",你的身份证号是"+ID);
	
		
	}
}
