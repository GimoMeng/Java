package com.demo;

public class Test3 {
	public static void main(String[] args) {
		//boolean�����ֱ���Ϊ�߼����ͣ�ֻ������ֵ��true��false
		boolean a = true;
		boolean b = false;
		//boolean���͵ı����������������͵�ֵ���и�ֵ����
		//boolean c = 14;
		//��Java���롢�򡢷��������߼���ϵ���������Ӧ��������ű�ʾ
		//���Ӧ&&��ֻ�е������ߵ�ֵ��Ϊtrueʱ����Ż���true������Ϊfalse
	    //���Ӧ||��ֻҪ�������ߵ�ֵ��һ��Ϊtrueʱ������ͻ���true
		//�Ƕ�Ӧ!����ʾȡ��ֵ������a=false;��!a=true;
		//if�����ص�:ֻ�е��������ʽΪtrueʱ���Ż�ִ��if����еĴ���
		if(a&&b){
			System.out.println("�����Ǹ�������!");
		}
		if(a||b){
			System.out.println("���첻�Ǹ�������!");
		}
		System.out.println("!a="+!a);
		System.out.println("!b="+!b);
	}

}
