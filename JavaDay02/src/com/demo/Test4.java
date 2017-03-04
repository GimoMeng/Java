package com.demo;
/**
 * 
 * 学习使用运算符
 * 1.加+、减-、乘*、除/、取余%(取模)
 * 2.+= -=  *=  /=  %=
 * 3.++ --
 *
 */
public class Test4 {
	public static void main(String[] args) {
		int a = 18;
		int b = 20;
		System.out.println(a+b);
		System.out.println(a-b);
		System.out.println(a*b);
		System.out.println(a/b);
		//向0取整，除法只要有小数，只要不够1就会被舍去
		System.out.println(2/3);
		System.out.println(3/4);
		//在Java中，0不能作为除数，此问题被称为除0问题
		//System.out.println(3/0);
		System.out.println(a%b);
		System.out.println(b%a);
		//%取模操作的结果的正负只和被除数有关系
		System.out.println(3%7);//3
		System.out.println(3%-7);//3
		System.out.println(-3%-7);//-3
		System.out.println(-3%7);//-3
		//a+=b;等价于a=a+b; a-=b等价于a=a-b;
		int c = 20;
		int d = 5;
		System.out.println("------华丽丽的分割线------");
		System.out.println(c+=d);
		System.out.println(c-=d);
		System.out.println(c*=d);
		System.out.println(c/=d);
		System.out.println(c%=d);
		
		System.out.println("------华丽丽的分割线------");
		//++ -- 举例i++;等价于i=i+1; i--等价于i=i-1;
		//++或者--放在i的后面，叫做后序增减，会先赋值再运算
		//++或者--放在i的前面，叫做前序增减，会先运算再赋值
		int i =25;
		i++;
		System.out.println(i++);
		i--;
		System.out.println(i--);
	}
	

}
