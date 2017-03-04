package com.demo.day03;
/**
 * 
 * 类：    一组具有相似特征的对象（事物）的模板，定义了该类事物所具有的共同的静态、动态特征
 * 对象：某一类事物的具体描述，拥有该类事物所有共同的静态、动态特征
 * 
 * 类是抽象的，对象是具体的
 * 
 * 一个类可以创建出多个对象
 * 
 * 在Java中类的定义形式
 * class 类名称{ 该类事物共同的特征}
 *
 *java三大特性：封装、继承、多态
 *
 *类有两个组成部分：静态属性和动态属性
 *静态属性指的是以类事物静态特征，比如人的年龄、姓名等，属性本身不变，变的是属性值
 *动态属性指的是方法，是一类事物动态特征，比如人类的吃饭、睡觉，简单理解是行为
 *静态属性又被称为成员变量，动态属性又被称为成员方法
 *
 */
public class Person {

	//年龄  整数
	private int age;
	//性别  boolean
	private boolean sexy;
	//姓名  字符串
	private String name;
	//人类吃饭的行为，动态属性
	public void eat(){
		System.out.println("吃饱了！");
	}
	//人类恋爱的行为，动态属性
	public void fallInLove(String someone){
		System.out.println("和"+someone+"恋爱了！");
	}
	
	
	
}
