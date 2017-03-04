package com.demo;

public class Test2 {
	//先写一个main按住alt键+/按键，根据提示选择即可
	public static void main(String[] args) {
		//定义一个double类型的变量叫d，值为3.14
		double d = 3.14;
		//定义一个float类型的变量叫f，值为5.0
		//在java中对于一个浮点数，默认看作是double类型的
		float f = 5.0f;
		double f2 = 5.0F;
		
		
		//定义一个char类型的变量值为a
		char c = 'a';
		char c2 = '我';
		char c3 = '9';
		//char类型是字符类型，只能装一个字符，超过一个就会出问题
		//char c4 = '97';
		//char类型按照阿斯克码表的顺序进行排序，第97位是a
		char c4 = 97;
		char c5 = 98;
		System.out.println("c4"+c4);
		System.out.println(c5);
		
		//string不是八种基本类型之一（Java八种基本数据类型不包括String类型）
		String str = "我是字符串类型，可放多个字符";
		
				
	}

}
