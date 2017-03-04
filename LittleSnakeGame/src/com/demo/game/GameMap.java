package com.demo.game;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.Random;

/**
 * 
 * 游戏地图类
 *
 */
public class GameMap {
	private int rows = 10;
	private int cols = 32;
	
	//HashSet也是一种集合，这种集合最大的特点是里面的数据不存在重复情况
	private HashSet<Node> foods = new HashSet<Node>();
	/*
	 * 此方法用于在地图上随机生成食物，实际上是食物坐标
	 * 将生成的食物装进foods集合中，然后在地图上显示供给贪吃蛇食用
	 */
	public void initFoods(int foodsNO){
		Random random = new Random();
		while(true){
			//利用随机类Random随机生成坐标
			//由于地图边界不能存在食物，因此-2
			int x = random.nextInt(rows-2)+1;
			int y = random.nextInt(cols-2)+1;
			//根据随机生成的坐标创建一个结点对象
			Node node = new Node(x,y);
			//判断当前结点对象是否包含在蛇的身躯内
			if(snake.snakePositions.contains(node)){
				//如果发现结点对象被包含在身躯内，则结束本次循环，进行下一次
				continue;
			}else{
				//否则，向集合中添加这个食物
				foods.add(node);
			}
			//当集合中已添加的数据的数量和规定生成的食物的数量一致，结束循环
			if(foods.size()==foodsNO){
				break;
			}
		}
		
	}
	
	
	private Snake snake;
	//对外提供一个能够获取到地图中贪吃蛇对象的方法
	public Snake getSnake(){
		return snake;
	}
	//地图类的构造方法，在创建地图对象时创建一条贪吃蛇
	public GameMap(){
		snake = new Snake();
		//生成食物，在创建完蛇后再创建食物
		initFoods(6);
	}
	public void printMap(){
		//外层循环会执行次，打印10行地图
		for(int i=0;i<rows;i++){
			//内层循环会执行32次，打印32列的内容
			for(int j=0;j<cols;j++){
				//如果是第一列或者是第一行就打印-
				if(i==0||i==rows-1){					
					System.out.print("-");
				}
				//如果是第一列或者是第一行就打印|
				else if(j==0||j==cols-1){
					System.out.print("|");
				}
				//contains方法是用来判断集合当中是否包含某一指定数据的方法
				//如果集合当中包含指定数据则返回true，否则为false
				//根据i和j的值创建一个坐标点（Node）对象
				//然后判断Node对象是否被包含在组成蛇身躯的集合中
				//如果包含则打印o，否则不考虑
				else if(snake.snakePositions.contains(new Node(i,j))){
					System.out.print("o");
				}
				//如果当前坐标点被包含在食物的集合中，打印食物的图标
				else if(foods.contains(new Node(i,j))){
					System.out.print("@");
				}
				//如果是普通的列或者普通的行就打印空格
				else{
					System.out.print(" ");
				}
			}
			System.out.println();
		}
		
	}
	//内部类
	public class Snake{
		//此处使用的是集合，集合可以理解为是一个大的容器，能盛装多个数据
		//以前我们用变量这个容器装数据，一个变量只能装一个数据
		//用集合的好处在于，一个集合能装多个数据
		//一条蛇是由多个点连接在一起组成的，多个点用集合装
		LinkedList<Node> snakePositions = new LinkedList<Node>();
		//蛇默认的前进方向
		private int direction;
		//定义贪吃蛇上下左右四个方向时对应的int类型的数值
		public static final int UP = -10;
		public static final int DOWN = 10;
		public static final int LEFT = -1;
		public static final int RIGHT = 1;
		//创建蛇时需要使用的构造方法
		public Snake(){
			//向盛装蛇每一点的集合中添加具体的点（横纵坐标）
			//如下代码表示，让地图中第三行，第九列的点作为蛇身躯的每一部分
			snakePositions.add(new Node(3,9));
			snakePositions.add(new Node(4,9));
			snakePositions.add(new Node(5,9));
			snakePositions.add(new Node(6,9));
			snakePositions.add(new Node(7,9));
			snakePositions.add(new Node(8,9));
			//蛇默认前进方向向上
			direction = UP;
		}
		/*
		 * 根据用户给出的方向，让贪吃蛇移动
		 * 但存在特殊情况：蛇本身是在向右移动，突然用户让其向左
		 * 此种特殊情况归类于：贪吃蛇不能逆向移动
		 */
		public void move(int direction){
			//贪吃蛇移动的方向：上加下为0，左加右为0
			if(this.direction+direction==0){
				System.out.println("贪吃蛇不能直接逆向移动！");
				System.out.println("GameOver!");
				//退出系统
				System.exit(0);
			}
			//如果用户给的指令是正常移动，则改变蛇移动的方向为用户指定方向
			this.direction = direction;
			//利用集合的getFirst方法从集合中获取到排行第一的数据
			//实际上获取到的是蛇头对应的坐标
			Node head = snake.snakePositions.getFirst();
			//此处是计算当蛇沿着某一方向移动后，蛇头所应该在的位置对应的坐标
			int i = head.getX()+this.direction/10;
			int j = head.getY()+this.direction%10;
			//根据计算后蛇头的坐标，创建一个新的点对象
			//将其添加在集合的首位替代原蛇头
			snake.snakePositions.addFirst(new Node(i,j));
			//集合有一个方法叫做remove用于删除集合中的数据
			//如果集合中存在指定要被删除的数据，则在删除之后会返回true
			//如果不存在则返回false
			//当集合删除head这个结点返回true时，实际相当于该节点是一个食物
			//立即return结束方法，不删除尾结点，实现贪吃蛇增长的效果
			//同时用于该食物已在集合中被删除，下次打印时就不会在出现在地图上
			if (foods.remove(head)){
				return;
			}
			//通过调用删除最后位置数据的方法，将集合中最后一个数据删除以完成贪吃蛇移动的过程
			snake.snakePositions.removeLast();
			//如果贪吃蛇将所有的食物吃完，foods集合中会没有数据
			//判断数据总数是否为0，适当添加一些食物
			if(foods.size()==0){
				initFoods(6);
			}
			//
			if(snake.snakePositions.size()==20){
				System.out.println("游戏胜利！");
				//
				System.exit(0);
			}
		}
	}
	

}
