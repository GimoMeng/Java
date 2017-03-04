package com.demo.game;

import java.util.Scanner;

import com.demo.game.GameMap.Snake;

/**
 * 
 * 游戏启动类
 *
 */
public class StartGame {
    public static void main(String[] args) {
    	//初始化地图
	    GameMap map = new GameMap();
	    //获取到地图中贪吃蛇对象以便于进行操作
	    Snake snake = map.getSnake();
	    //定义scanner类型的对象，用于接收用户通过控制台输入的指示
	    Scanner sc = new Scanner(System.in);
	    //while(true)表示死循环
	    while(true){
	    	//打印地图信息
	    	map.printMap();
	    	//获取用户指定的移动方向
	    	String direct = sc.nextLine();
	    	//如果用户输入w则让蛇向上移动
	    	if("w".equals(direct)){
	    		snake.move(snake.UP);
	    	}
	    	//向下移动
	    	else if("s".equals(direct)){
	    		snake.move(snake.DOWN);
	    	}
	    	//向左移动
	    	else if("a".equals(direct)){
	    		snake.move(snake.LEFT);
	    	}
	    	//向右移动
	    	else if("d".equals(direct)){
	    		snake.move(snake.RIGHT);
	    	}else{
	    		
	    	}
	    }
    }

}
