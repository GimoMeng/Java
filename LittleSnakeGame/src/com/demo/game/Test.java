package com.demo.game;

public class Test {
	public static void main(String[] args) {
		//创建对象的一般形式：类名 对象名 = new 类名（）；
		Node point = new Node();
		//如果想要创建某一类型的对象，必须调用构造方法
		//如果想要调用构造方法，必须通过new关键
		//一个对象一生只能调用一次构造方法
		Node point2 = new Node(5,7);
		//如何调用方法：对象名.方法名
		System.out.println(point.getY());
		System.out.println(point2.getY());
		//引用变量位于栈区，通过new关键字调用构造方法创建出来的对象在堆区
		//引用变量中存储的实际上是位于堆区的对象的地址
		//引用变量根据这个地址就会找到位于堆区的对象
		//每一个对象的地址都是唯一的
		Node point3 = new Node(5,7);
		System.out.println("==:"+(point2==point3));
		String s1 = new String("abc");
		String s2 = new String("abc");
		System.out.println(s1);
		System.out.println(s2);
		//如果比较两个引用变量时采用的是==，实际上比较的是两个引用变量里面存的地址
		//因此得到结论：==比较的值，而如果想要比较两个对象的内容，不能用==
		//如果要比较两个对象的内容需要用equals方法
		System.out.println(s1==s2);
		System.out.println("equals比较:"+s1.equals(s2));
		String s3 = null;
		//当使用equals方法进行比较时，注意需要把可能为空的对象放在后方
		//把不为空的对象放在前面，防止出现空指针异常
		//System.out.println(s3.equals(s2));
		System.out.println(s2.equals(s3));
		//如果被比较的两个对象所属的类当中没有自己定义equals方法
		//会使用从Object类继承来的equals方法，实际上等于在使用==比较
		//在Java所有的类都是Object类的子类，这里涉及Java第二大特性：继承
		System.out.println("比较point2和point3:"+point2.equals(point3));
		
	}
	
	

}
