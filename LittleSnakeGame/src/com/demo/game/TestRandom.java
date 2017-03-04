package com.demo.game;

import java.util.Random;

public class TestRandom {
	public static void main(String[] args) {
		//学习随机数的使用
		//在Java中如果想要使用随机生成一些内容时会使用到一个类Random
		//这个类一般情况下足以满足所有的随即要求
		//多用于生成随机数，但不光只能用于生成随机数
		Random random = new Random();
		for(int i=0;i<50;i++){
			/*
			 * 如果不指定随机生成数字的范围，则会在int类型所有范围内随机取值
			 * 一般情况下会人为的指定可以生成数字的最大值
			 * 指定方式：在（）写一个数字，表示最大值即可
			 * 如果指定了最大值，则生成的随机数会是从0开始到最大值为止
			 * 但不包含最大值，左闭右开区间
			 */
			int x = random.nextInt(10)+1;
			System.out.println("随机生成的数字"+x);
		}
		
	}

}
