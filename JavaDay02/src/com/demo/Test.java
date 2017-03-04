package com.demo;
/**
 * java语言一共有三种注释
 * 1.单行注释：由//注释内容组成，用来注释一行代码
 * 2.块注释(多行注释)：有/*注释内容，可以用于注释一段代码或者写一整段注释内容
 * 3.文档注释(Javadoc注释)：/**注释内容组成，表明一个类的作用，或者表明一个方法的作用，一般情况下会写在类名或者方法名的上方
 * Java的注释是不会被编译器编译的，通俗点说就是不会影响代码的运行效果
 */
public class Test {
	public static void main(String[] args){
		//定义一个byte类型的变量名字叫做a,值为10
		byte a = 10;
		short b = 11;
		int c = 12;
		long d = 13;
		//数据溢出:数据溢出的方向是反向的
		//举例  int a = 2147483647; 让a+1的值会变成-2147483648
		//在Java中默认会把一个整数看做是int类型
		//实际上相当于把一个int类型的数据赋值给一个byte类型的变量
		//byte类型的范围小于int类型能表示的范围
		//byte e = 1000
		//如果把一个范围大的类型的数据赋值给一个范围小的类型的数据时，需要强制类型转换
		byte e = (byte)1000;
		byte f = 15;
		//自动类型转换
		int g = f;
		System.out.println("g="+g);
		int h = 2147483647;
		//如果我们对一个long类型的变量赋值，并且所赋予的值大于int类型所能表示的范围
		//这个时候我们需要在该数值的后面加上l或者L表示此数值是一个long类型的数据
		//推荐用L，便于区分
		long j = 2147483648L;
		//int e = 1000;
		/*
		 * 如下这段代码是逐一输出a~e的值的
		 */
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
		System.out.println(e);
	}
	
}
