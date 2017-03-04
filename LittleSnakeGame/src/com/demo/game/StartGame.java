package com.demo.game;

import java.util.Scanner;

import com.demo.game.GameMap.Snake;

/**
 * 
 * ��Ϸ������
 *
 */
public class StartGame {
    public static void main(String[] args) {
    	//��ʼ����ͼ
	    GameMap map = new GameMap();
	    //��ȡ����ͼ��̰���߶����Ա��ڽ��в���
	    Snake snake = map.getSnake();
	    //����scanner���͵Ķ������ڽ����û�ͨ������̨�����ָʾ
	    Scanner sc = new Scanner(System.in);
	    //while(true)��ʾ��ѭ��
	    while(true){
	    	//��ӡ��ͼ��Ϣ
	    	map.printMap();
	    	//��ȡ�û�ָ�����ƶ�����
	    	String direct = sc.nextLine();
	    	//����û�����w�����������ƶ�
	    	if("w".equals(direct)){
	    		snake.move(snake.UP);
	    	}
	    	//�����ƶ�
	    	else if("s".equals(direct)){
	    		snake.move(snake.DOWN);
	    	}
	    	//�����ƶ�
	    	else if("a".equals(direct)){
	    		snake.move(snake.LEFT);
	    	}
	    	//�����ƶ�
	    	else if("d".equals(direct)){
	    		snake.move(snake.RIGHT);
	    	}else{
	    		
	    	}
	    }
    }

}
