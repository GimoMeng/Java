package com.demo;

public class Test3 {
	public static void main(String[] args) {
		//boolean类型又被称为逻辑类型，只有两个值：true或false
		boolean a = true;
		boolean b = false;
		//boolean类型的变量不能用其他类型的值进行赋值操作
		//boolean c = 14;
		//在Java中与、或、非这三种逻辑关系都有与其对应的特殊符号表示
		//与对应&&：只有当其两边的值均为true时结果才会是true，否则为false
	    //或对应||：只要当其两边的值有一方为true时，结果就会是true
		//非对应!：表示取反值，比如a=false;则!a=true;
		//if语句的特点:只有当（）表达式为true时，才会执行if语句中的代码
		if(a&&b){
			System.out.println("今天是个好天气!");
		}
		if(a||b){
			System.out.println("今天不是个好天气!");
		}
		System.out.println("!a="+!a);
		System.out.println("!b="+!b);
	}

}
