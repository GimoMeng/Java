package com.demo.game;
/**
 * 
 * 此类是对结点的抽象描述：结点类
 *
 */
public class Node {
	//该点的横坐标
	private int x;
	//该点的纵坐标
	private int y;
	//此方法为构造方法，用于创建对象，给对象赋予合适的初始值
	public Node(int i,int j){
		//根据创建对象时，传递过来的横纵坐标，给此结点的坐标赋予初始值
		this.x=i;
		this.y=j;
	}
	//此方法同样是构造方法，但由此方法创建出来的结点对象的坐标值均为0
	public Node(){
		
	}
	
	//对外界提供可以修改和获取该点横纵坐标的方法
	//右键 Source选项在弹出列表选择Generate Getters And Setters选项
	//外界获取横坐标时调用的方法
	public int getX() {
		return x;
	}
	//对外提供的设定该点横坐标的方法
	public void setX(int x) {
		this.x = x;
	}
	//外界获取该点纵坐标时调用的方法
	public int getY() {
		return y;
	}
	//对外提供的设定该点纵坐标的方法
	public void setY(int y) {
		this.y = y;
	}
	//重写equals方法，以适应当前结点类之间的比较
	@Override
	public boolean equals(Object obj) {
		//如果和当前对象进行比较的Obj为空，则直接返回结果false，表示不相同
		if(this==obj){
			return false;
		}
		//this表示的是当前对象本身，==比较的是地址，obj也是一个引用变量
		//如果两个引用变量的值是相等的话，证明两个引用变量指向的是同一个对象
		if(this==obj){
			return true;
		};
		//如果和当前对象进行比较的对象既不为空，又地址不同
		//则判断此对象是否属于Node结点类型
		//判断一个对象是否属于某一类型需要使用关键字instanceof
		//instanceof使用规则：
		//引用变量instanceof 类名 属于该类型为true，否则为false
		if(obj instanceof Node){
			//如果被比较对象属于Node类型，则进行强制类型转换
			Node node = (Node) obj;
			//分别比较X坐标和Y坐标，只有当两者均相等才能证明是同一对象
			return this.x==node.x&&this.y==node.y;
		}
		return false;
	}
	//人为没有办法查看对象在内存中的地址
	//只能看到地址由哈希算法转换而成的哈希码：hashcode
	//下列这个方法是用于自定义Node类型对象的哈希码的
	@Override
	public int hashCode() {
		//保证不会存在两个地址完全相同的Node对象
		return x<<16|y;
	}

}
