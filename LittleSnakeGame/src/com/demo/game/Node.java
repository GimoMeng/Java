package com.demo.game;
/**
 * 
 * �����ǶԽ��ĳ��������������
 *
 */
public class Node {
	//�õ�ĺ�����
	private int x;
	//�õ��������
	private int y;
	//�˷���Ϊ���췽�������ڴ������󣬸���������ʵĳ�ʼֵ
	public Node(int i,int j){
		//���ݴ�������ʱ�����ݹ����ĺ������꣬���˽������긳���ʼֵ
		this.x=i;
		this.y=j;
	}
	//�˷���ͬ���ǹ��췽�������ɴ˷������������Ľ����������ֵ��Ϊ0
	public Node(){
		
	}
	
	//������ṩ�����޸ĺͻ�ȡ�õ��������ķ���
	//�Ҽ� Sourceѡ���ڵ����б�ѡ��Generate Getters And Settersѡ��
	//����ȡ������ʱ���õķ���
	public int getX() {
		return x;
	}
	//�����ṩ���趨�õ������ķ���
	public void setX(int x) {
		this.x = x;
	}
	//����ȡ�õ�������ʱ���õķ���
	public int getY() {
		return y;
	}
	//�����ṩ���趨�õ�������ķ���
	public void setY(int y) {
		this.y = y;
	}
	//��дequals����������Ӧ��ǰ�����֮��ıȽ�
	@Override
	public boolean equals(Object obj) {
		//����͵�ǰ������бȽϵ�ObjΪ�գ���ֱ�ӷ��ؽ��false����ʾ����ͬ
		if(this==obj){
			return false;
		}
		//this��ʾ���ǵ�ǰ������==�Ƚϵ��ǵ�ַ��objҲ��һ�����ñ���
		//����������ñ�����ֵ����ȵĻ���֤���������ñ���ָ�����ͬһ������
		if(this==obj){
			return true;
		};
		//����͵�ǰ������бȽϵĶ���Ȳ�Ϊ�գ��ֵ�ַ��ͬ
		//���жϴ˶����Ƿ�����Node�������
		//�ж�һ�������Ƿ�����ĳһ������Ҫʹ�ùؼ���instanceof
		//instanceofʹ�ù���
		//���ñ���instanceof ���� ���ڸ�����Ϊtrue������Ϊfalse
		if(obj instanceof Node){
			//������Ƚ϶�������Node���ͣ������ǿ������ת��
			Node node = (Node) obj;
			//�ֱ�Ƚ�X�����Y���ֻ꣬�е����߾���Ȳ���֤����ͬһ����
			return this.x==node.x&&this.y==node.y;
		}
		return false;
	}
	//��Ϊû�а취�鿴�������ڴ��еĵ�ַ
	//ֻ�ܿ�����ַ�ɹ�ϣ�㷨ת�����ɵĹ�ϣ�룺hashcode
	//������������������Զ���Node���Ͷ���Ĺ�ϣ���
	@Override
	public int hashCode() {
		//��֤�������������ַ��ȫ��ͬ��Node����
		return x<<16|y;
	}

}
