package com.demo.game;

import java.util.Random;

public class TestRandom {
	public static void main(String[] args) {
		//ѧϰ�������ʹ��
		//��Java�������Ҫʹ���������һЩ����ʱ��ʹ�õ�һ����Random
		//�����һ������������������е��漴Ҫ��
		//�����������������������ֻ���������������
		Random random = new Random();
		for(int i=0;i<50;i++){
			/*
			 * �����ָ������������ֵķ�Χ�������int�������з�Χ�����ȡֵ
			 * һ������»���Ϊ��ָ�������������ֵ����ֵ
			 * ָ����ʽ���ڣ���дһ�����֣���ʾ���ֵ����
			 * ���ָ�������ֵ�������ɵ���������Ǵ�0��ʼ�����ֵΪֹ
			 * �����������ֵ������ҿ�����
			 */
			int x = random.nextInt(10)+1;
			System.out.println("������ɵ�����"+x);
		}
		
	}

}
