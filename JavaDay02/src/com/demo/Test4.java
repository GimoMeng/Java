package com.demo;
/**
 * 
 * ѧϰʹ�������
 * 1.��+����-����*����/��ȡ��%(ȡģ)
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
		//��0ȡ��������ֻҪ��С����ֻҪ����1�ͻᱻ��ȥ
		System.out.println(2/3);
		System.out.println(3/4);
		//��Java�У�0������Ϊ�����������ⱻ��Ϊ��0����
		//System.out.println(3/0);
		System.out.println(a%b);
		System.out.println(b%a);
		//%ȡģ�����Ľ��������ֻ�ͱ������й�ϵ
		System.out.println(3%7);//3
		System.out.println(3%-7);//3
		System.out.println(-3%-7);//-3
		System.out.println(-3%7);//-3
		//a+=b;�ȼ���a=a+b; a-=b�ȼ���a=a-b;
		int c = 20;
		int d = 5;
		System.out.println("------�������ķָ���------");
		System.out.println(c+=d);
		System.out.println(c-=d);
		System.out.println(c*=d);
		System.out.println(c/=d);
		System.out.println(c%=d);
		
		System.out.println("------�������ķָ���------");
		//++ -- ����i++;�ȼ���i=i+1; i--�ȼ���i=i-1;
		//++����--����i�ĺ��棬�����������������ȸ�ֵ������
		//++����--����i��ǰ�棬����ǰ�����������������ٸ�ֵ
		int i =25;
		i++;
		System.out.println(i++);
		i--;
		System.out.println(i--);
	}
	

}
