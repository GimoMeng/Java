package com.demo.game;

public class Test {
	public static void main(String[] args) {
		//���������һ����ʽ������ ������ = new ����������
		Node point = new Node();
		//�����Ҫ����ĳһ���͵Ķ��󣬱�����ù��췽��
		//�����Ҫ���ù��췽��������ͨ��new�ؼ�
		//һ������һ��ֻ�ܵ���һ�ι��췽��
		Node point2 = new Node(5,7);
		//��ε��÷�����������.������
		System.out.println(point.getY());
		System.out.println(point2.getY());
		//���ñ���λ��ջ����ͨ��new�ؼ��ֵ��ù��췽�����������Ķ����ڶ���
		//���ñ����д洢��ʵ������λ�ڶ����Ķ���ĵ�ַ
		//���ñ������������ַ�ͻ��ҵ�λ�ڶ����Ķ���
		//ÿһ������ĵ�ַ����Ψһ��
		Node point3 = new Node(5,7);
		System.out.println("==:"+(point2==point3));
		String s1 = new String("abc");
		String s2 = new String("abc");
		System.out.println(s1);
		System.out.println(s2);
		//����Ƚ��������ñ���ʱ���õ���==��ʵ���ϱȽϵ����������ñ��������ĵ�ַ
		//��˵õ����ۣ�==�Ƚϵ�ֵ���������Ҫ�Ƚ�������������ݣ�������==
		//���Ҫ�Ƚ����������������Ҫ��equals����
		System.out.println(s1==s2);
		System.out.println("equals�Ƚ�:"+s1.equals(s2));
		String s3 = null;
		//��ʹ��equals�������бȽ�ʱ��ע����Ҫ�ѿ���Ϊ�յĶ�����ں�
		//�Ѳ�Ϊ�յĶ������ǰ�棬��ֹ���ֿ�ָ���쳣
		//System.out.println(s3.equals(s2));
		System.out.println(s2.equals(s3));
		//������Ƚϵ����������������൱��û���Լ�����equals����
		//��ʹ�ô�Object��̳�����equals������ʵ���ϵ�����ʹ��==�Ƚ�
		//��Java���е��඼��Object������࣬�����漰Java�ڶ������ԣ��̳�
		System.out.println("�Ƚ�point2��point3:"+point2.equals(point3));
		
	}
	
	

}
