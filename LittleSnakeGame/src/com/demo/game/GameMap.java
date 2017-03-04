package com.demo.game;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.Random;

/**
 * 
 * ��Ϸ��ͼ��
 *
 */
public class GameMap {
	private int rows = 10;
	private int cols = 32;
	
	//HashSetҲ��һ�ּ��ϣ����ּ��������ص�����������ݲ������ظ����
	private HashSet<Node> foods = new HashSet<Node>();
	/*
	 * �˷��������ڵ�ͼ���������ʳ�ʵ������ʳ������
	 * �����ɵ�ʳ��װ��foods�����У�Ȼ���ڵ�ͼ����ʾ����̰����ʳ��
	 */
	public void initFoods(int foodsNO){
		Random random = new Random();
		while(true){
			//���������Random�����������
			//���ڵ�ͼ�߽粻�ܴ���ʳ����-2
			int x = random.nextInt(rows-2)+1;
			int y = random.nextInt(cols-2)+1;
			//����������ɵ����괴��һ��������
			Node node = new Node(x,y);
			//�жϵ�ǰ�������Ƿ�������ߵ�������
			if(snake.snakePositions.contains(node)){
				//������ֽ����󱻰����������ڣ����������ѭ����������һ��
				continue;
			}else{
				//�����򼯺���������ʳ��
				foods.add(node);
			}
			//������������ӵ����ݵ������͹涨���ɵ�ʳ�������һ�£�����ѭ��
			if(foods.size()==foodsNO){
				break;
			}
		}
		
	}
	
	
	private Snake snake;
	//�����ṩһ���ܹ���ȡ����ͼ��̰���߶���ķ���
	public Snake getSnake(){
		return snake;
	}
	//��ͼ��Ĺ��췽�����ڴ�����ͼ����ʱ����һ��̰����
	public GameMap(){
		snake = new Snake();
		//����ʳ��ڴ������ߺ��ٴ���ʳ��
		initFoods(6);
	}
	public void printMap(){
		//���ѭ����ִ�дΣ���ӡ10�е�ͼ
		for(int i=0;i<rows;i++){
			//�ڲ�ѭ����ִ��32�Σ���ӡ32�е�����
			for(int j=0;j<cols;j++){
				//����ǵ�һ�л����ǵ�һ�оʹ�ӡ-
				if(i==0||i==rows-1){					
					System.out.print("-");
				}
				//����ǵ�һ�л����ǵ�һ�оʹ�ӡ|
				else if(j==0||j==cols-1){
					System.out.print("|");
				}
				//contains�����������жϼ��ϵ����Ƿ����ĳһָ�����ݵķ���
				//������ϵ��а���ָ�������򷵻�true������Ϊfalse
				//����i��j��ֵ����һ������㣨Node������
				//Ȼ���ж�Node�����Ƿ񱻰���������������ļ�����
				//����������ӡo�����򲻿���
				else if(snake.snakePositions.contains(new Node(i,j))){
					System.out.print("o");
				}
				//�����ǰ����㱻������ʳ��ļ����У���ӡʳ���ͼ��
				else if(foods.contains(new Node(i,j))){
					System.out.print("@");
				}
				//�������ͨ���л�����ͨ���оʹ�ӡ�ո�
				else{
					System.out.print(" ");
				}
			}
			System.out.println();
		}
		
	}
	//�ڲ���
	public class Snake{
		//�˴�ʹ�õ��Ǽ��ϣ����Ͽ������Ϊ��һ�������������ʢװ�������
		//��ǰ�����ñ����������װ���ݣ�һ������ֻ��װһ������
		//�ü��ϵĺô����ڣ�һ��������װ�������
		//һ�������ɶ����������һ����ɵģ�������ü���װ
		LinkedList<Node> snakePositions = new LinkedList<Node>();
		//��Ĭ�ϵ�ǰ������
		private int direction;
		//����̰�������������ĸ�����ʱ��Ӧ��int���͵���ֵ
		public static final int UP = -10;
		public static final int DOWN = 10;
		public static final int LEFT = -1;
		public static final int RIGHT = 1;
		//������ʱ��Ҫʹ�õĹ��췽��
		public Snake(){
			//��ʢװ��ÿһ��ļ�������Ӿ���ĵ㣨�������꣩
			//���´����ʾ���õ�ͼ�е����У��ھ��еĵ���Ϊ��������ÿһ����
			snakePositions.add(new Node(3,9));
			snakePositions.add(new Node(4,9));
			snakePositions.add(new Node(5,9));
			snakePositions.add(new Node(6,9));
			snakePositions.add(new Node(7,9));
			snakePositions.add(new Node(8,9));
			//��Ĭ��ǰ����������
			direction = UP;
		}
		/*
		 * �����û������ķ�����̰�����ƶ�
		 * ����������������߱������������ƶ���ͻȻ�û���������
		 * ����������������ڣ�̰���߲��������ƶ�
		 */
		public void move(int direction){
			//̰�����ƶ��ķ����ϼ���Ϊ0�������Ϊ0
			if(this.direction+direction==0){
				System.out.println("̰���߲���ֱ�������ƶ���");
				System.out.println("GameOver!");
				//�˳�ϵͳ
				System.exit(0);
			}
			//����û�����ָ���������ƶ�����ı����ƶ��ķ���Ϊ�û�ָ������
			this.direction = direction;
			//���ü��ϵ�getFirst�����Ӽ����л�ȡ�����е�һ������
			//ʵ���ϻ�ȡ��������ͷ��Ӧ������
			Node head = snake.snakePositions.getFirst();
			//�˴��Ǽ��㵱������ĳһ�����ƶ�����ͷ��Ӧ���ڵ�λ�ö�Ӧ������
			int i = head.getX()+this.direction/10;
			int j = head.getY()+this.direction%10;
			//���ݼ������ͷ�����꣬����һ���µĵ����
			//��������ڼ��ϵ���λ���ԭ��ͷ
			snake.snakePositions.addFirst(new Node(i,j));
			//������һ����������remove����ɾ�������е�����
			//��������д���ָ��Ҫ��ɾ�������ݣ�����ɾ��֮��᷵��true
			//����������򷵻�false
			//������ɾ��head�����㷵��trueʱ��ʵ���൱�ڸýڵ���һ��ʳ��
			//����return������������ɾ��β��㣬ʵ��̰����������Ч��
			//ͬʱ���ڸ�ʳ�����ڼ����б�ɾ�����´δ�ӡʱ�Ͳ����ڳ����ڵ�ͼ��
			if (foods.remove(head)){
				return;
			}
			//ͨ������ɾ�����λ�����ݵķ����������������һ������ɾ�������̰�����ƶ��Ĺ���
			snake.snakePositions.removeLast();
			//���̰���߽����е�ʳ����꣬foods�����л�û������
			//�ж����������Ƿ�Ϊ0���ʵ����һЩʳ��
			if(foods.size()==0){
				initFoods(6);
			}
			//
			if(snake.snakePositions.size()==20){
				System.out.println("��Ϸʤ����");
				//
				System.exit(0);
			}
		}
	}
	

}
